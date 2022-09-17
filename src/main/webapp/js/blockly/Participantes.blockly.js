window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Participantes = window.blockly.js.blockly.Participantes || {};

/**
 * @function verificar_idade
 *
 * Participantes
 *
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 17:10:35
 *
 */
window.blockly.js.blockly.Participantes.verificar_idadeArgs = [];
window.blockly.js.blockly.Participantes.verificar_idade = async function() {

  //
  if (this.cronapi.screen.getValueOfField("Participante.active.idade") < 14) {
    //
    valido = false;
    //
    this.cronapi.screen.notify('error','Idade não pode ser menor que 14 anos');
  } else {
    //
    valido = true;
  }
  return valido;
}

/**
 * @function confirmar_envio
 *
 * Participantes
 *
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 17:10:35
 *
 */
window.blockly.js.blockly.Participantes.confirmar_envioArgs = [];
window.blockly.js.blockly.Participantes.confirmar_envio = async function() {

  //
  if ((await this.blockly.js.blockly.Participantes.verificar_idade())) {
    //
    (await this.cronapi.screen.post("Participante"));
  } else {
    //
    this.cronapi.screen.notify('error','Dados de idade inválidos');
  }
}
