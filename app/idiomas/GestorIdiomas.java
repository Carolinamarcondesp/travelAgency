package app.idiomas;

import agencia.Idiomas;
import java.util.ArrayList;

public class GestorIdiomas {

    //Main Menu
    public static String getLabelMenuPrincipal(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MenuPrincipal;
            case ENG:
                return ENG.MenuPrincipal;
            default:
                return PT.MenuPrincipal;
        }
    }

    public static String getLabelEscolherIdioma(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.EscolherIdioma;
            case ENG:
                return ENG.EscolherIdioma;
            default:
                return PT.EscolherIdioma;
        }
    }

    public static String getLabelCriarCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.CriarCliente;
            case ENG:
                return ENG.CriarCliente;
            default:
                return PT.CriarCliente;
        }
    }

    public static String getLabelListarClientes(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.ListarClientes;
            case ENG:
                return ENG.ListarClientes;
            default:
                return PT.ListarClientes;
        }

    }

    public static String getLabelAbrirMenuHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AbrirMenuHotel;
            case ENG:
                return ENG.AbrirMenuHotel;
            default:
                return PT.AbrirMenuHotel;
        }

    }

    public static String getLabelAbrirMenuRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AbrirMenuRestaurante;
            case ENG:
                return ENG.AbrirMenuRestaurante;
            default:
                return PT.AbrirMenuRestaurante;
        }

    }

    public static String getLabelAbrirMenuAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AbrirMenuAtracaoTuristica;
            case ENG:
                return ENG.AbrirMenuAtracaoTuristica;
            default:
                return PT.AbrirMenuAtracaoTuristica;
        }

    }

    public static String getLabelpedirNomeCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirNomeCliente;
            case ENG:
                return ENG.pedirNomeCliente;
            default:
                return PT.pedirNomeCliente;
        }

    }

    public static String getLabelpedirEmailCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirEmailCliente;
            case ENG:
                return ENG.pedirEmailCliente;
            default:
                return PT.pedirEmailCliente;
        }

    }

    public static String getLabelpedirNIFCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirNIFCliente;
            case ENG:
                return ENG.pedirNIFCliente;
            default:
                return PT.pedirNIFCliente;
        }

    }

    public static String getLabeldevolveNomeCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveNomeCliente;
            case ENG:
                return ENG.devolveNomeCliente;
            default:
                return PT.devolveNomeCliente;
        }

    }

    public static String getLabeldevolveEmailCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveEmailCliente;
            case ENG:
                return ENG.devolveEmailCliente;
            default:
                return PT.devolveEmailCliente;
        }

    }

    public static String getLabeldevolveNIFCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveNIFCliente;
            case ENG:
                return ENG.devolveNIFCliente;
            default:
                return PT.devolveNIFCliente;
        }

    }

    public static String getLabelMsgSucessoCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgSucessoCliente;
            case ENG:
                return ENG.MsgSucessoCliente;
            default:
                return PT.MsgSucessoCliente;
        }

    }

    public static String getLabelMsgErroCliente(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgErroCliente;
            case ENG:
                return ENG.MsgErroCliente;
            default:
                return PT.MsgErroCliente;
        }

    }

    // Atração Turistica

    public static String getLabelMenuAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MenuAtracaoTuristica;
            case ENG:
                return ENG.MenuAtracaoTuristica;
            default:
                return PT.MenuAtracaoTuristica;
        }

    }

    public static String getLabelMarcarVisita(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MarcarVisita;
            case ENG:
                return ENG.MarcarVisita;
            default:
                return PT.MarcarVisita;
        }

    }

    public static String getLabelAlterarVisita(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AlterarVisita;
            case ENG:
                return ENG.AlterarVisita;
            default:
                return PT.AlterarVisita;
        }

    }

    public static String getLabelPesquisarVisita(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.PesquisarVisita;
            case ENG:
                return ENG.PesquisarVisita;
            default:
                return PT.PesquisarVisita;
        }

    }

    public static String getLabelCancelarVisita(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.CancelarVisita;
            case ENG:
                return ENG.CancelarVisita;
            default:
                return PT.CancelarVisita;
        }

    }

    public static String getLabelpedirIDAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirIDAtracaoTuristica;
            case ENG:
                return ENG.pedirIDAtracaoTuristica;
            default:
                return PT.pedirIDAtracaoTuristica;
        }

    }

    public static String getLabelpedirNomeAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirNomeAtracaoTuristica;
            case ENG:
                return ENG.pedirNomeAtracaoTuristica;
            default:
                return PT.pedirNomeAtracaoTuristica;
        }

    }

    public static String getLabelpedirLocalAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirLocalAtracaoTuristica;
            case ENG:
                return ENG.pedirLocalAtracaoTuristica;
            default:
                return PT.pedirLocalAtracaoTuristica;
        }

    }

    public static String getLabelpedirDataAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirDataAtracaoTuristica;
            case ENG:
                return ENG.pedirDataAtracaoTuristica;
            default:
                return PT.pedirDataAtracaoTuristica;
        }

    }

    public static String getLabelpedirHoraAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirHoraAtracaoTuristica;
            case ENG:
                return ENG.pedirHoraAtracaoTuristica;
            default:
                return PT.pedirHoraAtracaoTuristica;
        }

    }

    public static String getLabelpedirPaxAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirPaxAtracaoTuristica;
            case ENG:
                return ENG.pedirPaxAtracaoTuristica;
            default:
                return PT.pedirPaxAtracaoTuristica;
        }

    }

    public static String getLabeldevolveNomeAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveNomeAtracaoTuristica;
            case ENG:
                return ENG.devolveNomeAtracaoTuristica;
            default:
                return PT.devolveNomeAtracaoTuristica;
        }

    }

    public static String getLabeldevolveLocalAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveLocalAtracaoTuristica;
            case ENG:
                return ENG.devolveLocalAtracaoTuristica;
            default:
                return PT.devolveLocalAtracaoTuristica;
        }

    }

    public static String getLabeldevolveDataAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveDataAtracaoTuristica;
            case ENG:
                return ENG.devolveDataAtracaoTuristica;
            default:
                return PT.devolveDataAtracaoTuristica;
        }

    }

    public static String getLabeldevolveHoraAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveHoraAtracaoTuristica;
            case ENG:
                return ENG.devolveHoraAtracaoTuristica;
            default:
                return PT.devolveHoraAtracaoTuristica;
        }

    }

    public static String getLabeldevolvePaxAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolvePaxAtracaoTuristica;
            case ENG:
                return ENG.devolvePaxAtracaoTuristica;
            default:
                return PT.devolvePaxAtracaoTuristica;
        }

    }

    public static String getLabelMsgSucessoAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgSucessoAtracaoTuristica;
            case ENG:
                return ENG.MsgSucessoAtracaoTuristica;
            default:
                return PT.MsgSucessoAtracaoTuristica;
        }

    }

    public static String getLabelMsgErroAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgErroAtracaoTuristica;
            case ENG:
                return ENG.MsgErroAtracaoTuristica;
            default:
                return PT.MsgErroAtracaoTuristica;
        }

    }

    public static String getLabeldataAlteradaSucessoAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.dataAlteradaSucessoAtracaoTuristica;
            case ENG:
                return ENG.dataAlteradaSucessoAtracaoTuristica;
            default:
                return PT.dataAlteradaSucessoAtracaoTuristica;
        }

    }

    public static String getLabelhoraAlteradaSucessoAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.horaAlteradaSucessoAtracaoTuristica;
            case ENG:
                return ENG.horaAlteradaSucessoAtracaoTuristica;
            default:
                return PT.horaAlteradaSucessoAtracaoTuristica;
        }

    }

    public static String getLabelpaxAlteradaSucessoAtracaoTuristica(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.paxAlteradaSucessoAtracaoTuristica;
            case ENG:
                return ENG.paxAlteradaSucessoAtracaoTuristica;
            default:
                return PT.paxAlteradaSucessoAtracaoTuristica;
        }

    }

    public static String getLabelAtracaoTuristicaNaoExiste(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.AtracaoTuristicaNaoExiste(id);
            case ENG:
                return ENG.AtracaoTuristicaNaoExiste(id);
            default:
                return PT.AtracaoTuristicaNaoExiste(id);
        }

    }

    public static String getLabelAtracaoTuristicaApagadaSucesso(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.AtracaoTuristicaApagadaSucesso(id); 
            case ENG:
                return ENG.AtracaoTuristicaApagadaSucesso(id);
            default:
                return PT.AtracaoTuristicaApagadaSucesso(id);
        }

    }

    //Hotel

    public static String getLabelMenuHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MenuHotel;
            case ENG:
                return ENG.MenuHotel;
            default:
                return PT.MenuHotel;
        }

    }

    public static String getLabelFazerReserva(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.FazerReserva;
            case ENG:
                return ENG.FazerReserva;
            default:
                return PT.FazerReserva;
        }

    }

    public static String getLabelAlterarReserva(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AlterarReserva;
            case ENG:
                return ENG.AlterarReserva;
            default:
                return PT.AlterarReserva;
        }

    }

    public static String getLabelPesquisarReserva(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.PesquisarReserva;
            case ENG:
                return ENG.PesquisarReserva;
            default:
                return PT.PesquisarReserva;
        }

    }

    public static String getLabelCancelarReserva(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.CancelarReserva;
            case ENG:
                return ENG.CancelarReserva;
            default:
                return PT.CancelarReserva;
        }

    }

    public static String getLabelpedirIDHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirIDHotel;
            case ENG:
                return ENG.pedirIDHotel;
            default:
                return PT.pedirIDHotel;
        }

    }

    public static String getLabelpedirNomeHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirNomeHotel;
            case ENG:
                return ENG.pedirNomeHotel;
            default:
                return PT.pedirNomeHotel;
        }

    }

    public static String getLabelpedirLocalHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirLocalHotel;
            case ENG:
                return ENG.pedirLocalHotel;
            default:
                return PT.pedirLocalHotel;
        }

    }


    public static String getLabelpedirDataCheckinHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirDataCheckinHotel;
            case ENG:
                return ENG.pedirDataCheckinHotel;
            default:
                return PT.pedirDataCheckinHotel;
        }

    }

    public static String getLabelpedirHoraCheckinHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirHoraCheckinHotel;
            case ENG:
                return ENG.pedirHoraCheckinHotel;
            default:
                return PT.pedirHoraCheckinHotel;
        }

    }

    public static String getLabelpedirDataCheckoutHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirDataCheckoutHotel;
            case ENG:
                return ENG.pedirDataCheckoutHotel;
            default:
                return PT.pedirDataCheckoutHotel;
        }

    }

    public static String getLabelpedirHoraCheckoutHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirHoraCheckoutHotel;
            case ENG:
                return ENG.pedirHoraCheckoutHotel;
            default:
                return PT.pedirHoraCheckoutHotel;
        }

    }

    public static String getLabelpedirCamasHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirCamasHotel;
            case ENG:
                return ENG.pedirCamasHotel;
            default:
                return PT.pedirCamasHotel;
        }

    }

    public static String getLabelpedirQuartosHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirQuartosHotel;
            case ENG:
                return ENG.pedirQuartosHotel;
            default:
                return PT.pedirQuartosHotel;
        }

    }

    public static String getLabelpedirPaxHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirPaxHotel;
            case ENG:
                return ENG.pedirPaxHotel;
            default:
                return PT.pedirPaxHotel;
        }

    }

    public static String getLabeldevolveNomeHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveNomeHotel;
            case ENG:
                return ENG.devolveNomeHotel;
            default:
                return PT.devolveNomeHotel;
        }

    }

    public static String getLabeldevolveLocalHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveLocalHotel;
            case ENG:
                return ENG.devolveLocalHotel;
            default:
                return PT.devolveLocalHotel;
        }

    }

    public static String getLabeldevolveDataCheckinHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveDataCheckinHotel;
            case ENG:
                return ENG.devolveDataCheckinHotel;
            default:
                return PT.devolveDataCheckinHotel;
        }

    }

    public static String getLabeldevolveHoraCheckinHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveHoraCheckinHotel;
            case ENG:
                return ENG.devolveHoraCheckinHotel;
            default:
                return PT.devolveHoraCheckinHotel;
        }

    }

    public static String getLabeldevolveDataCheckoutHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveDataCheckoutHotel;
            case ENG:
                return ENG.devolveDataCheckoutHotel;
            default:
                return PT.devolveDataCheckoutHotel;
        }

    }

    public static String getLabeldevolveHoraCheckoutHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveHoraCheckoutHotel;
            case ENG:
                return ENG.devolveHoraCheckoutHotel;
            default:
                return PT.devolveHoraCheckoutHotel;
        }

    }

    public static String getLabeldevolveCamasHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveCamasHotel;
            case ENG:
                return ENG.devolveCamasHotel;
            default:
                return PT.devolveCamasHotel;
        }

    }

    public static String getLabeldevolveQuartosHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveQuartosHotel;
            case ENG:
                return ENG.devolveQuartosHotel;
            default:
                return PT.devolveQuartosHotel;
        }

    }

    public static String getLabeldevolvePaxHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolvePaxHotel;
            case ENG:
                return ENG.devolvePaxHotel;
            default:
                return PT.devolvePaxHotel;
        }

    }

    public static String getLabelMsgSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgSucessoHotel;
            case ENG:
                return ENG.MsgSucessoHotel;
            default:
                return PT.MsgSucessoHotel;
        }

    }

    public static String getLabelMsgErroHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgErroHotel;
            case ENG:
                return ENG.MsgErroHotel;
            default:
                return PT.MsgErroHotel;
        }

    }

    public static String getLabeldataCheckinAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.dataCheckinAlteradaSucessoHotel;
            case ENG:
                return ENG.dataCheckinAlteradaSucessoHotel;
            default:
                return PT.dataCheckinAlteradaSucessoHotel;
        }

    }

    public static String getLabelhoraCheckinAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.horaCheckinAlteradaSucessoHotel;
            case ENG:
                return ENG.horaCheckinAlteradaSucessoHotel;
            default:
                return PT.horaCheckinAlteradaSucessoHotel;
        }

    }


    public static String getLabeldataCheckoutAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.dataCheckoutAlteradaSucessoHotel;
            case ENG:
                return ENG.dataCheckoutAlteradaSucessoHotel;
            default:
                return PT.dataCheckoutAlteradaSucessoHotel;
        }

    }


    public static String getLabelhoraCheckoutAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.horaCheckoutAlteradaSucessoHotel;
            case ENG:
                return ENG.horaCheckoutAlteradaSucessoHotel;
            default:
                return PT.horaCheckoutAlteradaSucessoHotel;
        }

    }

    public static String getLabelcamasAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.camasAlteradaSucessoHotel;
            case ENG:
                return ENG.camasAlteradaSucessoHotel;
            default:
                return PT.camasAlteradaSucessoHotel;
        }

    }

    public static String getLabelquartosAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.quartosAlteradaSucessoHotel;
            case ENG:
                return ENG.quartosAlteradaSucessoHotel;
            default:
                return PT.quartosAlteradaSucessoHotel;
        }

    }


    public static String getLabelpaxAlteradaSucessoHotel(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.paxAlteradaSucessoHotel;
            case ENG:
                return ENG.paxAlteradaSucessoHotel;
            default:
                return PT.paxAlteradaSucessoHotel;
        }

    }

    public static String getLabelHotelNaoExiste(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.HotelNaoExiste(id);
            case ENG:
                return ENG.HotelNaoExiste(id);
            default:
                return PT.HotelNaoExiste(id);
        }

    }

    public static String getLabelHotelApagadaSucesso(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.HotelApagadaSucesso(id);
            case ENG:
                return ENG.HotelApagadaSucesso(id);
            default:
                return PT.HotelApagadaSucesso(id);
        }

    }

    public static String getLabelMenuRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MenuRestaurante;
            case ENG:
                return ENG.MenuRestaurante;
            default:
                return PT.MenuRestaurante;
        }

    }

    public static String getLabelFazerMarcacao(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.FazerMarcacao;
            case ENG:
                return ENG.FazerMarcacao;
            default:
                return PT.FazerMarcacao;
        }

    }

    public static String getLabelAlterarMarcacao(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.AlterarMarcacao;
            case ENG:
                return ENG.AlterarMarcacao;
            default:
                return PT.AlterarMarcacao;
        }

    }

    public static String getLabelPesquisarMarcacao(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.PesquisarMarcacao;
            case ENG:
                return ENG.PesquisarMarcacao;
            default:
                return PT.PesquisarMarcacao;
        }

    }

    public static String getLabelCancelarMarcacao(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.CancelarMarcacao;
            case ENG:
                return ENG.CancelarMarcacao;
            default:
                return PT.CancelarMarcacao;
        }

    }

    public static String getLabelpedirIDRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirIDRestaurante;
            case ENG:
                return ENG.pedirIDRestaurante;
            default:
                return PT.pedirIDRestaurante;
        }

    }

    public static String getLabelpedirNomeRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirNomeRestaurante;
            case ENG:
                return ENG.pedirNomeRestaurante;
            default:
                return PT.pedirNomeRestaurante;
        }

    }

    public static String getLabelpedirLocalRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirLocalRestaurante;
            case ENG:
                return ENG.pedirLocalRestaurante;
            default:
                return PT.pedirLocalRestaurante;
        }

    }

    public static String getLabelpedirDataRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirDataRestaurante;
            case ENG:
                return ENG.pedirDataRestaurante;
            default:
                return PT.pedirDataRestaurante;
        }

    }

    public static String getLabelpedirHoraRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirHoraRestaurante;
            case ENG:
                return ENG.pedirHoraRestaurante;
            default:
                return PT.pedirHoraRestaurante;
        }

    }

    public static String getLabelpedirPaxRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.pedirPaxRestaurante;
            case ENG:
                return ENG.pedirPaxRestaurante;
            default:
                return PT.pedirPaxRestaurante;
        }

    }

    public static String getLabeldevolveNomeRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveNomeRestaurante;
            case ENG:
                return ENG.devolveNomeRestaurante;
            default:
                return PT.devolveNomeRestaurante;
        }

    }


    public static String getLabeldevolveLocalRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveLocalRestaurante;
            case ENG:
                return ENG.devolveLocalRestaurante;
            default:
                return PT.devolveLocalRestaurante;
        }

    }

    public static String getLabeldevolveDataRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveDataRestaurante;
            case ENG:
                return ENG.devolveDataRestaurante;
            default:
                return PT.devolveDataRestaurante;
        }

    }

    public static String getLabeldevolveHoraRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolveHoraRestaurante;
            case ENG:
                return ENG.devolveHoraRestaurante;
            default:
                return PT.devolveHoraRestaurante;
        }

    }

    public static String getLabeldevolvePaxRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.devolvePaxRestaurante;
            case ENG:
                return ENG.devolvePaxRestaurante;
            default:
                return PT.devolvePaxRestaurante;
        }

    }

    public static String getLabelMsgSucessoRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgSucessoRestaurante;
            case ENG:
                return ENG.MsgSucessoRestaurante;
            default:
                return PT.MsgSucessoRestaurante;
        }

    }

    public static String getLabelMsgErroRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.MsgErroRestaurante;
            case ENG:
                return ENG.MsgErroRestaurante;
            default:
                return PT.MsgErroRestaurante;
        }

    }

    public static String getLabeldataAlteradaSucessoRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.dataAlteradaSucessoRestaurante;
            case ENG:
                return ENG.dataAlteradaSucessoRestaurante;
            default:
                return PT.dataAlteradaSucessoRestaurante;
        }

    }

    public static String getLabelhoraAlteradaSucessoRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.horaAlteradaSucessoRestaurante;
            case ENG:
                return ENG.horaAlteradaSucessoRestaurante;
            default:
                return PT.horaAlteradaSucessoRestaurante;
        }

    }

    public static String getLabelpaxAlteradaSucessoRestaurante(Idiomas idioma) {
        switch (idioma) {
            case PT:
                return PT.paxAlteradaSucessoRestaurante;
            case ENG:
                return ENG.paxAlteradaSucessoRestaurante;
            default:
                return PT.paxAlteradaSucessoRestaurante;
        }

    }

    public static String getLabelRestauranteNaoExiste(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.RestauranteNaoExiste(id);
            case ENG:
                return ENG.RestauranteNaoExiste(id);
            default:
                return PT.RestauranteNaoExiste(id);
        }

    }

    public static String getLabelRestauranteApagadaSucesso(Idiomas idioma, int id) {
        switch (idioma) {
            case PT:
                return PT.RestauranteApagadaSucesso(id);
            case ENG:
                return ENG.RestauranteApagadaSucesso(id);
            default:
                return PT.RestauranteApagadaSucesso(id);
        }

    }

}
