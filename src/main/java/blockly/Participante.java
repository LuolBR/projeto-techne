package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Participante {

public static final int TIMEOUT = 300;

/**
 *
 * @author Lucas Oliveira Da Silva
 * @since 13/09/2022 09:31:46
 *
 */
public static Var obterIdParticipanteLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.Participante"),Var.valueOf("select p from Participante p where p.user.normalizedUserName = :userNormalizedUserName"),Var.valueOf("userNormalizedUserName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0].id"));
   }
 }.call();
}

/**
 *
 * Participante
 *
 * @param Entidade<app.entity.Participante>
 *
 * @author Lucas Oliveira Da Silva
 * @since 13/09/2022 09:31:46
 *
 */
public static Var obterLoginUsuraioLogado(@ParamMetaData(description = "Entidade", id = "941eb4d0") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

