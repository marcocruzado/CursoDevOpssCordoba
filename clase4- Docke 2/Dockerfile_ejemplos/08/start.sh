#! /bin/bash
sudo docker build -t python-course .

sudo docker run -d --rm --name python \
--hostname python \
-v ${PWD}:/usr/src/app python-course &&  sudo docker exec -it python bash

sudo docker stop python 
