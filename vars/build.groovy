def compile() {
 sh 'mvn compile'
}
def maven() {
 sh 'mvn package'
}
def gradel() {
 echo "this is gradel"
}
