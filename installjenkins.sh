docker pull jenkins
mkdir $PWD/jenkins
chown 1000 $PWD/jenkins
docker run -d -p 49001:8080 -v $PWD/jenkins:/var/jenkins_home:z -t jenkins