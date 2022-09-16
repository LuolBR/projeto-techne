window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.StatusAtividades = window.blockly.js.blockly.StatusAtividades || {};

/**
 * @function verifica_status
 *
 * StatusAtividades
 *
 *
 * @author Lucas Oliveira Da Silva
 * @since 16/09/2022 10:44:46
 *
 */
window.blockly.js.blockly.StatusAtividades.verifica_statusArgs = [];
window.blockly.js.blockly.StatusAtividades.verifica_status = async function() {

  //
  if (this.cronapi.screen.getValueOfField("Tipo_vaga.active.status_participante_nome_status") != 'Em processo de avaliação') {
    //
    this.cronapi.screen.notify('warning','Só é possível acessar suas atividades quando estiver \"Em processo de avaliação\", favor verificar Status!');
  } else {
    //
    this.cronapi.screen.changeView("#/home/Participante/checklist_participante",[  ]);
  }
}
