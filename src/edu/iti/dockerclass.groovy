package edu.iti;

def build(imageName)
{
    sh "docker build -t ${imageName}"

}
def push(imageName)
{
    sh "docker push -t ${imageName}}"

}

def login(userName, passWord)
{
    sh "docker login -u ${userName} -p ${passWord}"

}

