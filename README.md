# ATEC Travel Management

O programa em java da ATEC Travel Management, descreve a estrutura de um sistema de agência de viagens, as classes do sistema, os seus atributos, os seus métodos e as relações entre objetos. As principais classes do Atec Travel Management são Agencia, Idiomas, Cliente, AtraçãoTuristica, Hotel, e Restaurante.

### Classes da ATEC Travel Management

- **Classe Agencia:** Gerencia todas as operações da ATEC Travel Management  
- **Classe Idiomas:** Gerencia todas as operações de Idiomas  
- **Classe Cliente:** Gerencia todas as operações do Cliente  
- **Classe Hotel:** Gerencia todas as operações do Hotel  
- **Classe Restaurante:** Gerencia todas as operações do Restaurante  
- **Classe AtracaoTuristica:** Gerencia todas as operações das Atividades  

### Classes e Atributos da ATEC Travel Management

| Classes | Atributos |
| ----------- | ----------- |
| Idiomas | PT, ENG |
| Cliente | id, nome, email, NIF |
| Hotel | id, nomeHotel, localHotel, checkinHotel, horacheckinHotel, checkoutHotel, horacheckoutHotel, camasHotel, quartosHotel, paxHotel |
| Restaurante | id, nomeRestaurante, localRestaurante, dataRestaurante, horaRestaurante, paxRestaurante |
| AtracaoTuristica | id, nomeAtracaoTuristica, localAtracaoTuristica, dataAtracaoTuristica, horaAtracaoTuristica, paxAtracaoTuristica |

### Classes e Métodos da ATEC Travel Management

| Classes | Métodos |
| ----------- | ----------- |
| Idiomas | escolherIdiomaENG( ), escolherIdiomaPT( ), trocarIdioma( ) |
| Cliente | criarCliente( ), listarClientes( ) |
| Hotel | criarHotel( ), listarHotel( ), apagaHotel( ), HotelExiste( ), alteranomeHotel( ) |
| Restaurante | criarRestaurante( ), listarRestaurante( ), apagaRestaurante( ), RestauranteExiste( ), alteraNomeRestaurante( ) |
| AtracaoTuristica | criarAtracaoTuristica( ), listarAtracaoTuristica( ), apagaAtracaoTuristica( ), AtracaoTuristicaExiste( ), alteraNomeAtracaoTuristica( ) |


