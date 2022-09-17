package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CalculoHorasProcesso {

public static final int TIMEOUT = 300;

/**
 *
 * CalculoHorasProcesso
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 11:22:13
 *
 */
public static Var alterarHoraInicioFim() throws Exception {
 return new Callable<Var>() {

   private Var status = Var.VAR_NULL;

   public Var call() throws Exception {
    status =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Participante.active.status_participante_nome_status"));
    if (
    Var.valueOf(status.equals(
    Var.valueOf("Em processo de avaliação"))).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Participante.active.inicio_processo"),
        cronapi.dateTime.Operations.getNow());
    }
    if (
    Var.valueOf(
    Var.valueOf(status.equals(
    Var.valueOf("Aprovado"))).getObjectAsBoolean() ||
    Var.valueOf(status.equals(
    Var.valueOf("Reprovado"))).getObjectAsBoolean()).getObjectAsBoolean()) {
        concluirProcesso();
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 11:22:13
 *
 */
public static void calcularTotalHoras() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Participante.active.total_horas_processo"),
    cronapi.dateTime.Operations.getHoursBetweenDates(
    cronapi.dateTime.Operations.getNow(),
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Participante.active.inicio_processo"))));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 11:22:13
 *
 */
public static void concluirProcesso() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(
    Var.valueOf(validarCampoNulo(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Participante.active.inicio_processo")))).equals(
    Var.VAR_FALSE)).getObjectAsBoolean()) {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Favor primeiro iniciar processo de avaliação! Status Participante -> Em processo de avaliação"));
    } else {
        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("Participante.active.fim_processo"),
        cronapi.dateTime.Operations.getNow());
        calcularTotalHoras();
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param campo
 *
 * @author Lucas Oliveira Da Silva
 * @since 17/09/2022 11:22:13
 *
 */
public static Var validarCampoNulo(@ParamMetaData(description = "campo", id = "a850afad") Var campo) throws Exception {
 return new Callable<Var>() {

   private Var valido = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    cronapi.logic.Operations.isNullOrEmpty(campo).getObjectAsBoolean()) {
        valido =
        Var.VAR_FALSE;
    } else {
        valido =
        Var.VAR_TRUE;
    }
    return valido;
   }
 }.call();
}

}

