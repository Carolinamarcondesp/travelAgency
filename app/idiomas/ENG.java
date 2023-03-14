package app.idiomas;

public class ENG {

    //Main menu
    public static String MenuPrincipal = "Main Menu"; 
    public static String EscolherIdioma = "Mudar para Português";
    public static String CriarCliente = "Create Guest "; 
    public static String ListarClientes = "List all Guests"; 
    public static String AbrirMenuHotel = "Open Hotel Main Menu"; 
    public static String AbrirMenuRestaurante = "Open Restaurant Main Menu"; 
    public static String AbrirMenuAtracaoTuristica = "Open Sightseeing Main Menu"; 

    public static String pedirNomeCliente = "Insert name -> "; 
    public static String pedirEmailCliente = "Insert e-mail -> "; 
    public static String pedirNIFCliente = "Insert VAT number -> "; 

    public static String devolveNomeCliente = "Name submitted was -> "; 
    public static String devolveEmailCliente = "The e-mail submitted was -> "; 
    public static String devolveNIFCliente = "The VAT number submitted was -> "; 

    public static String MsgSucessoCliente = "Guest Successfully created"; 
    public static String MsgErroCliente = "ERROR!  This VAT number already exists "; 

    //Sightseeing
    public static String MenuAtracaoTuristica = "Sightseeing Menu";
    public static String MarcarVisita = "Schedule a sightseeing tour";
    public static String AlterarVisita = "Change a sightseeing tour ";
    public static String PesquisarVisita = "Search all sightseeing tours";
    public static String CancelarVisita = "Cancel a sightseeing tour ";

    public static String pedirIDAtracaoTuristica = "Insert activity’s ID ->";
    public static String pedirNomeAtracaoTuristica = "Insert activity’s name->";
    public static String pedirLocalAtracaoTuristica = "Insert activity’s location->";
    public static String pedirDataAtracaoTuristica = "Insert activity’s date (yyyy-mm-dd) ->";
    public static String pedirHoraAtracaoTuristica = "Insert activity’s time(hh:mm) ->";
    public static String pedirPaxAtracaoTuristica = "Insert number of persons ->";

    public static String devolveNomeAtracaoTuristica = "Activity’s name submitted was -> ";
    public static String devolveLocalAtracaoTuristica = "Activity’s location submitted was -> ";
    public static String devolveDataAtracaoTuristica = "Activity’s date submitted was (yyyy-mm-dd) -> ";
    public static String devolveHoraAtracaoTuristica = "Activity’s time submitted was at (hh:mm) -> ";
    public static String devolvePaxAtracaoTuristica = "Number of persons submitted -> ";

    public static String MsgSucessoAtracaoTuristica = "Sightseeing successfully created";
    public static String MsgErroAtracaoTuristica = "This name is already registered ";

    public static String dataAlteradaSucessoAtracaoTuristica = "Date successfully changed";
    public static String horaAlteradaSucessoAtracaoTuristica = "Time successfully changed ";
    public static String paxAlteradaSucessoAtracaoTuristica = "Number of people successfully changed ";

    public static String AtracaoTuristicaNaoExiste(int id) { 

        return "Sightseeing with this ID = " + id + " doesn’t exists"; 
    }

    public static String AtracaoTuristicaApagadaSucesso(int id) {
        return "Sightseeing with this ID = " + id + " successfully deleted";
    }

    //Hotel

    public static String MenuHotel = "Hotel Main Menu";
    public static String FazerReserva = "Make a Reservation";
    public static String AlterarReserva = "Change Reservation ";
    public static String PesquisarReserva = "Search all Reservations";
    public static String CancelarReserva = "Cancel Reservation ";

    public static String pedirIDHotel = " Insert Hotel’s ID ->";
    public static String pedirNomeHotel = "Insert Hotel’s name ->";
    public static String pedirLocalHotel = "Insert Hotel’s Location->";
    public static String pedirDataCheckinHotel = "Check-in date (yyyy-mm-dd) ->";
    public static String pedirHoraCheckinHotel = "Check in time (hh:mm) ->";
    public static String pedirDataCheckoutHotel = "Check-out date (yyyy-mm-dd) ->";
    public static String pedirHoraCheckoutHotel = "Check-out time (hh:mm) ->";
    public static String pedirCamasHotel = "Insert number of beds ->";
    public static String pedirQuartosHotel = "Insert number of bedrooms->";
    public static String pedirPaxHotel = "Insert number of persons ->";

    public static String devolveNomeHotel = "Hotel’s name submitted was ->";
    public static String devolveLocalHotel = "Hotel’s location submitted was -> ";
    public static String devolveDataCheckinHotel = "The Check-in date submitted was on (yyyy-mm-dd) ->";
    public static String devolveHoraCheckinHotel = "The Check-in time submitted was (hh:mm) ->";
    public static String devolveDataCheckoutHotel = "The Check-out date submitted was on (yyyy-mm-dd) ->";
    public static String devolveHoraCheckoutHotel = "The Check-out time submitted was at (hh:mm) ->";
    public static String devolveCamasHotel = "Number of beds submitted ->";
    public static String devolveQuartosHotel = "Number of bedrooms submitted->";
    public static String devolvePaxHotel = "Number of persons submitted -> ";

    public static String MsgSucessoHotel = "Hotel successfully created ";
    public static String MsgErroHotel = "This name is already registered ";

    public static String dataCheckinAlteradaSucessoHotel = "Check-in date successfully changed (yyyy-mm-dd) ->";
    public static String horaCheckinAlteradaSucessoHotel = "Check in time successfully changed hh:mm) ->";
    public static String dataCheckoutAlteradaSucessoHotel = "Check-out date successfully changed (yyyy-mm-dd) ->";
    public static String horaCheckoutAlteradaSucessoHotel = "Check-out time successfully changed (hh:mm) ->";
    public static String camasAlteradaSucessoHotel = "Number of beds successfully changed to ->";
    public static String quartosAlteradaSucessoHotel = "Number of bedrooms successfully changed to ->";
    public static String paxAlteradaSucessoHotel = "Number of people successfully changed to -> ";

    public static String HotelNaoExiste(int id) {
        return "Hotel with this ID = " + id + " doesn't exist";
    }

    public static String HotelApagadaSucesso(int id) {
        return "Hotel with this ID = " + id + " successfully deleted";
    }

    //Restaurant 

    public static String MenuRestaurante = "Restaurant Main Menu"; 
    public static String FazerMarcacao = "Make a Reservation "; 
    public static String AlterarMarcacao = "Change Reservation "; 
    public static String PesquisarMarcacao = "Search all Reservations "; 
    public static String CancelarMarcacao = "Cancel Reservation "; 

    public static String pedirIDRestaurante = "Insert Restaurant’s ID ->"; 
    public static String pedirNomeRestaurante = "Insert Restaurant’s name ->"; 
    public static String pedirLocalRestaurante = "Insert Restaurant’s location->"; 
    public static String pedirDataRestaurante = "Insert the meal date (yyyy-mm-dd) ->"; 
    public static String pedirHoraRestaurante = "Insert the meal time (hh:mm) ->"; 
    public static String pedirPaxRestaurante = "Insert number of persons ->"; 

    public static String devolveNomeRestaurante = "Restaurant’s name submitted was -> "; 
    public static String devolveLocalRestaurante = "Restaurant’s location submitted was -> "; 
    public static String devolveDataRestaurante = "Meal date submitted was on (yyyy-mm-dd) -> "; 
    public static String devolveHoraRestaurante = "Meal time submitted was at (hh:mm) -> "; 
    public static String devolvePaxRestaurante = "Number of persons submitted -> "; 

    public static String MsgSucessoRestaurante = "Restaurant successfully created "; 
    public static String MsgErroRestaurante = "This name is already registered "; 

    public static String dataAlteradaSucessoRestaurante = "Reservation date successfully changed (yyyy-mm-dd) ->"; 
    public static String horaAlteradaSucessoRestaurante = "Reservation time successfully changed (hh:mm) ->";
    public static String paxAlteradaSucessoRestaurante = "Number of persons successfully changed ->";

    public static String RestauranteNaoExiste(int id) { 

        return "Restaurant with this ID = " + id + " doesn’t exist"; 

    } 

    public static String RestauranteApagadaSucesso(int id) { 

        return " Restaurant with this ID = " + id + " successfully deleted"; 
    }
}
