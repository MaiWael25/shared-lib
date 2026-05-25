package edu.iti

class MavenClass implements Serializable {

    def steps

    MavenClass(steps) {
        this.steps = steps
    }

    def build(command) {
        steps.sh "mvn ${command}"
    }

    def test() {
        steps.sh "mvn test"
    }
}
