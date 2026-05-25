package edu.iti

class mavenClass implements Serializable {

    def steps

    mavenClass(steps) {
        this.steps = steps
    }

    def build(command) {
        steps.sh "mvn ${command}"
    }

    def test() {
        steps.sh "mvn test"
    }
}
