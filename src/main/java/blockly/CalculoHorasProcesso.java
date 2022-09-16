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
 * @since 16/09/2022 15:50:03
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
 * Descreva esta função...
 *
 * @author Lucas Oliveira Da Silva
 * @since 16/09/2022 15:50:03
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

}

