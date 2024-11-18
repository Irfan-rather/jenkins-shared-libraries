def call(String Project, String ImageTag, String dockerhubuser ){
sh "docker compose up -d ${dockerhubuser}/${Project}:${ImageTag}"

}
