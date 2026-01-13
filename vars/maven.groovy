def call(List command){
  for (cmd in command) {
    return "sh ${cmd}"
  }
}