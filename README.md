# Microservices 
sudo docker run -d -p 49001:8080 -v $PWD/jenkins:/var/jenkins_home:z -v /var/run/docker.sock:/var/run/docker.sock -t jenkinswithdocker:1


