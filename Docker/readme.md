# Docker
  ## List command:
  - Check version docker:
    ```
    docker -v
    ```
  - Check list container running on the host:  **docker ps**
  - Check container all: docker ps -a
  - Check docker images: docker images
  
  - Run docker images: docker run [image ID || images repository]
    - Run Images and assign a name to the container: --name [custome_name]
    - Run with -d (detach): Run container in background and print container ID
    - Attach local standard input, output, and error streams to a running container: **docker attach [container_id]**
    - Run with -p 80:80: mapping port host to port docker container run.

---------------
  - Get infomation of docker Object: **docker inspect [container_id]**
  - Ip Adress: accesst to docker from browser. 
  - Map ip docker to ip local (the same port): docker run -p portdocker:portlocal
  - Stop one container: **docker stop [container ID|container_name]**
  - Stop all docker is running: **docker stop $(docker ps -a -q)**
  - Delete docker iamges: **docker rmi [image_id]**
  - Delete container(container stoped): **docker rm [container_id]**
  - Pull docker from repository: **docker pull [repo_name:tag]**
  
---------------------
  