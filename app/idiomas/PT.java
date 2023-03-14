package app.idiomas;

import java.util.ArrayList;

public class PT {

    // Menu Principal
    public static String MenuPrincipal = "Menu Principal";
    public static String EscolherIdioma = "Change to English";
    public static String CriarCliente = "Criar Cliente";
    public static String ListarClientes = "Listar Clientes";
    public static String AbrirMenuHotel = "Abrir Menu Hotel";
    public static String AbrirMenuRestaurante = "Abrir Menu Restaurante";
    public static String AbrirMenuAtracaoTuristica = "Abrir Menu Atração Turística";

    public static String pedirNomeCliente = "Insira o seu nome -> ";
    public static String pedirEmailCliente = "Insira o seu e-mail -> ";
    public static String pedirNIFCliente = "Insira o seu NIF -> ";

    public static String devolveNomeCliente = "O nome registrado foi -> ";
    public static String devolveEmailCliente = "O e-mail registrado foi -> ";
    public static String devolveNIFCliente = "O NIF registrado foi -> ";

    public static String MsgSucessoCliente = "O cliente foi criado com sucesso ";
    public static String MsgErroCliente = "O NIF inserido já se encontra registrado ";
    
    // Atração Turistica

    public static String MenuAtracaoTuristica = "Menu Atracao Turistica";
    public static String MarcarVisita = "Marcar Visita";
    public static String AlterarVisita = "Alterar Visita";
    public static String PesquisarVisita = "Pesquisar Visita";
    public static String CancelarVisita = "Cancelar Visita";

    public static String pedirIDAtracaoTuristica = "Insira o id da atividade ->";
    public static String pedirNomeAtracaoTuristica = "Insira o nome da atividade ->";
    public static String pedirLocalAtracaoTuristica = "Insira o local da atividade ->";
    public static String pedirDataAtracaoTuristica = "Insira a data da atividade (aaaa-mm-dd) ->";
    public static String pedirHoraAtracaoTuristica = "Insira a hora da atividade (hh:mm) ->";
    public static String pedirPaxAtracaoTuristica = "Insira a quantidade de pessoas envolvidas na atividade ->";

    public static String devolveNomeAtracaoTuristica = "O nome da atividade registrado foi -> ";
    public static String devolveLocalAtracaoTuristica = "O local da atividade registrado foi -> ";
    public static String devolveDataAtracaoTuristica = "A data da atividade registrada foi(aaaa-mm-dd) -> ";
    public static String devolveHoraAtracaoTuristica = "A hora da atividade registrada foi (hh:mm) -> ";
    public static String devolvePaxAtracaoTuristica = "A quantidade de pessoas registrada(as) foi -> ";

    public static String MsgSucessoAtracaoTuristica = "Atividade foi criada com sucesso ";
    public static String MsgErroAtracaoTuristica = "O nome inserido já se encontra registrado ";

    public static String dataAlteradaSucessoAtracaoTuristica = "Data alterada com sucesso ";
    public static String horaAlteradaSucessoAtracaoTuristica = "Hora alterada com sucesso ";
    public static String paxAlteradaSucessoAtracaoTuristica = "Quantidade de pessoas alterada com sucesso ";

    public static String AtracaoTuristicaNaoExiste(int id) {
        return "Atividade com ID = " + id + " não existe";
    }

    public static String AtracaoTuristicaApagadaSucesso(int id) {
        return "Atividade com ID = " + id + " apagada com sucesso";
    }

    //Hotel

    public static String MenuHotel = "Menu Hotel";
    public static String FazerReserva = "Fazer Reserva";
    public static String AlterarReserva = "Alterar Reserva";
    public static String PesquisarReserva = "Pesquisar Reserva";
    public static String CancelarReserva = "Cancelar Reserva";

    public static String pedirIDHotel = "Insira o id do hotel ->";
    public static String pedirNomeHotel = "Insira o nome do hotel ->";
    public static String pedirLocalHotel = "Insira o local do hotel ->";
    public static String pedirDataCheckinHotel = "Data de Check-in (aaaa-mm-dd) ->";
    public static String pedirHoraCheckinHotel = "Hora de Check-in (hh:mm) ->";
    public static String pedirDataCheckoutHotel = "Data de Check-out (aaaa-mm-dd) ->";
    public static String pedirHoraCheckoutHotel = "Hora de Check-out (hh:mm) ->";
    public static String pedirCamasHotel = "Insira a quantidade de camas ->";
    public static String pedirQuartosHotel = "Insira a quantidade de quartos ->";
    public static String pedirPaxHotel = "Insira a quantidade de pessoas ->";

    public static String devolveNomeHotel = "O nome do hotel registrado foi ->";
    public static String devolveLocalHotel = "O local da atividade registrado foi -> ";
    public static String devolveDataCheckinHotel = "A data de Check-in registrada foi (aaaa-mm-dd) ->";
    public static String devolveHoraCheckinHotel = "A hora de Check-in registrada foi (hh:mm) ->";
    public static String devolveDataCheckoutHotel = "A data de Check-out registrada foi (aaaa-mm-dd) ->";
    public static String devolveHoraCheckoutHotel = "A hora de Check-out registrada foi (hh:mm) ->";
    public static String devolveCamasHotel = "A quantidade de camas registrada(as) foi ->";
    public static String devolveQuartosHotel = "A quantidade de quartos registrado(os) foi->";
    public static String devolvePaxHotel = "A quantidade de pessoas registrada(as) foi -> ";

    public static String MsgSucessoHotel = "Hotel foi criado com sucesso ";
    public static String MsgErroHotel = "O nome inserido já se encontra registrado ";

    public static String dataCheckinAlteradaSucessoHotel = "A data de Check-in registrada foi (aaaa-mm-dd) ->";
    public static String horaCheckinAlteradaSucessoHotel = "A hora de Check-in registrada foi (hh:mm) ->";
    public static String dataCheckoutAlteradaSucessoHotel = "A data de Check-out registrada foi (aaaa-mm-dd) ->";
    public static String horaCheckoutAlteradaSucessoHotel = "A hora de Check-out registrada foi (hh:mm) ->";
    public static String camasAlteradaSucessoHotel = "A quantidade de camas registrada(as) foi ->";
    public static String quartosAlteradaSucessoHotel = "A quantidade de quartos registrado(os) foi->";
    public static String paxAlteradaSucessoHotel = "A quantidade de pessoas registrada(as) foi -> ";

    public static String HotelNaoExiste(int id) {
        return "Hotel com ID = " + id + " não existe";
    }

    public static String HotelApagadaSucesso(int id) {
        return "Hotel com ID = " + id + " apagada com sucesso";
    }

    //Restaurante

    public static String MenuRestaurante = "Menu Restaurante";
    public static String FazerMarcacao = "Fazer Marcação";
    public static String AlterarMarcacao = "Alterar Marcação";
    public static String PesquisarMarcacao = "Pesquisar Marcação";
    public static String CancelarMarcacao = "Cancelar Marcação";

    public static String pedirIDRestaurante = "Insira o id do restaurante ->";
    public static String pedirNomeRestaurante = "Insira o nome do restaurante ->";
    public static String pedirLocalRestaurante = "Insira o local do restaurante ->";
    public static String pedirDataRestaurante = "Insira a data da refeição (aaaa-mm-dd) ->";
    public static String pedirHoraRestaurante = "Insira a hora da refeição (hh:mm) ->";
    public static String pedirPaxRestaurante = "Insira a quantidade de pessoas envolvidas na refeição ->";

    public static String devolveNomeRestaurante = "O nome do restaurante registrado foi -> ";
    public static String devolveLocalRestaurante = "O local do restaurante registrado foi -> ";
    public static String devolveDataRestaurante = "A data da refeição registrada foi(aaaa-mm-dd) -> ";
    public static String devolveHoraRestaurante = "A hora da refeição registrada foi (hh:mm) -> ";
    public static String devolvePaxRestaurante = "A quantidade de pessoas registrada(as) foi -> ";

    public static String MsgSucessoRestaurante = "Restaurante foi criado com sucesso ";
    public static String MsgErroRestaurante = "O nome inserido já se encontra registrado ";

    public static String dataAlteradaSucessoRestaurante = "Data alterada com sucesso ";
    public static String horaAlteradaSucessoRestaurante = "Hora alterada com sucesso ";
    public static String paxAlteradaSucessoRestaurante = "Quantidade de pessoas alterada com sucesso ";

    public static String RestauranteNaoExiste(int id) {
        return "Restaurante com ID = " + id + " não existe";
    }

    public static String RestauranteApagadaSucesso(int id) {
        return "Restaurante com ID = " + id + " apagado com sucesso";
    }
}
