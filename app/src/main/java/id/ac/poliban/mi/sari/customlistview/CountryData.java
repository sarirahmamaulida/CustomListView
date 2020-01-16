package id.ac.poliban.mi.sari.customlistview;

import java.util.ArrayList;
import java.util.List;

public class CountryData {

    static List<Country> getAllCountries(){
        List<Country> data = new ArrayList<>();
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Flag_of_Indonesia.svg/125px-Flag_of_Indonesia.svg.png", "Indonesia", "Republik Indonesia (RI) atau Negara Kesatuan Republik Indonesia (NKRI), atau lebih umum disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/125px-Flag_of_Brazil.svg.png", "Brazil", "Republik Federatif Brasil atau Republik Federal Brasil (bahasa Portugis: República Federativa do Brasil, bahasa Inggris: Federative Republic of Brazil, bahasa Latin: Respublica Foederativa Brasiliae) adalah negara paling besar dan paling banyak penduduknya(204.5 juta jiwa pada tahun 2017[4]) di Amerika Selatan."));


        return data;
    }
}
