<div style="background-color:lightgray; padding:10px;">

<h1>SpringBoot Application on AWS EKS using ECR</h1>


<h2>
<p style="font-size:16px; color:red;">
# STEP-1: Build the project:
</p></h2>

First build the project springboot-eks to generate the .jar under the target folder
* mvn clean install


<h2>
<p style="font-size:16px; color:red;">
# STEP-2 : Create the Docker image by running the below command at project root directory:
</p></h2>

* docker build -t springboot-eks .

<h2>
<p style="font-size:16px; color:red;">
# STEP-3: Verify the image creation via command
</p></h2>
* docker images
REPOSITORY          TAG         IMAGE ID        CREATED              SIZE
springboot-eks     latest    208429527292   11 seconds ago   567MB

<h2>
<p style="font-size:16px; color:red;">
# STEP-4: Run the Docker image locally to verify the application is working fine
</p></h2>

* docker run -p 8080:8080 springboot-eks

<h2>
<p style="font-size:16px; color:red;">
# STEP-5: Verify the application is running by accessing the below URL in the browser
</p></h2>
* http://localhost:8080/greetings


<h2>
<p style="font-size:16px; color:red;">
# STEP-6: Create an ECR repository namely springboot-eks in AWS-CONSOLE and then click on the view push commands
to see how to push the local Docker image in to the AWS ECR repository

![img_2.png](img_2.png)
</h2>  

<h2>
<p style="font-size:16px; color:red;">
# STEP-7: Push the Docker image to the AWS ECR via AWS-CLI
</p></h2>
* aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 123456789012.dkr.ecr.us-east-1.amazonaws.com

* docker tag springboot-eks:latest 123456789012.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest

* docker push 123456789012.dkr.ecr.us-east-1.amazonaws.com/springboot-eks:latest

</div>