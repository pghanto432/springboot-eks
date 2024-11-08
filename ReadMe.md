# STEP-1: Build the project:

First build the project springboot-eks to generate the .jar under the target folder
* mvn clean install



# STEP-2 : Create the Docker image by running the below command at project root directory:

* docker build -t springboot-eks .

# STEP-3: Verify the image creation via command
* docker images
  
REPOSITORY          TAG         IMAGE ID        CREATED              SIZE


springboot-eks     latest    208429527292   11 seconds ago   567MB