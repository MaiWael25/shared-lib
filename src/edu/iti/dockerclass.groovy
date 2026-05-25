/*
package edu.iti;

def build(imageName, imageTag)
{
    sh "docker build -t ${imageName}:${imageTag}"

}
def push(imageName, imageTag)
{
    sh "docker push -t ${imageName}:${imageTag}"

}

def login(userName, passWord)
{
    sh "docker login -u ${userName} -p ${passWord}"

}
*/
package edu.iti

class dockerclass implements Serializable {

    def steps

    dockerclass(steps) {
        this.steps = steps
    }

    def build(imageName, imageTag) {
        steps.sh "docker build -t ${imageName}:${imageTag} ."
    }

    def push(imageName, imageTag) {
        steps.sh "docker push ${imageName}:${imageTag}"
    }

    def login(userName, passWord) {
        steps.sh "docker login -u ${userName} -p ${passWord}"
    }
}
