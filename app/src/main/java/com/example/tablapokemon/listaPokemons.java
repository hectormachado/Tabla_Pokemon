package com.example.tablapokemon;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class listaPokemons extends AppCompatActivity {

    public static ArrayList<cPokemon> listapokemons = new ArrayList<cPokemon>();

    private ListView lst;
    private Button btn_terminar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_filtro, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pokemons);

       listapokemons.add(new cPokemon(1,"@drawable/bulbasaur","@drawable/sbulbasaur","Bulbasaur", "#1", "PLANTA", "VENENO","Pokemon semilla","Una rara semilla fue plantada en su espalda al nacer. La planta brota y crece con este Pokémon.", "0.7 m", "6.9 kg" , "Espesura","Clorofila", "https://pokemon.fandom.com/es/wiki/Bulbasaur"));
       listapokemons.add(new cPokemon(2,"@drawable/ivysaur", "@drawable/sivysaur","Ivysaur", "#2", "PLANTA", "VENENO","Pokemon semilla","Cuando el bulbo de su espalda crece, parece no poder ponerse de pie sobre sus patas traseras.","1.0 m","13.0 kg","Espesura","Clorofila","https://pokemon.fandom.com/es/wiki/Ivysaur"));
       listapokemons.add(new cPokemon(3,"@drawable/venusaur", "@drawable/svenusaur","Venusaur", "#3", "PLANTA", "VENENO","Pokemon semilla","La planta florece cuando absorbe energía solar. Ésta le obliga a ponerse en busca de la luz solar.","2.0 m","100.0 kg","Espesura","Clorofila","https://pokemon.fandom.com/es/wiki/Venusaur"));
       listapokemons.add(new cPokemon(4,"@drawable/charmander", "@drawable/scharmander","Charmander", "#4", "FUEGO", "", "Pokemon lagartija", "Prefiere los sitios calientes. Dicen que cuando llueve sale vapor de la punta de su cola.", "0.6 m", "8.5 kg", "Mar llamas", "Poder solar", "https://pokemon.fandom.com/es/wiki/Charmander"));
       listapokemons.add(new cPokemon(5,"@drawable/charmeleon", "@drawable/scharmeleon","Charmeleon", "#5", "FUEGO", "","Pokemon llama","Cuando está luchando su llama arde vivamente, esto eleva las temperaturas.","1.1m","19 kg","Mar llamas","Poder solar","https://pokemon.fandom.com/es/wiki/Charmeleon"));
       listapokemons.add(new cPokemon(6,"@drawable/charizard", "@drawable/scharizard","Charizard", "#6", "FUEGO", "VOLADOR","Pokemon llama","Escupe fuego tan caliente que funde las rocas. Causa incendios forestales sin querer.","1.7 m","90.5 kg","Mar llamas","Poder solar","https://pokemon.fandom.com/es/wiki/Charizard"));
       listapokemons.add(new cPokemon(7,"@drawable/squirtle", "@drawable/ssquirtle","Squirtle", "#7", "AGUA", "", "Pokemon tortuguita", "Tras nacer, su espalda se hincha y endurece como una concha. Echa potente espuma por la boca.", "0.5 m", "9.0 kg", "Torrente", "Cura lluvia", "https://pokemon.fandom.com/es/wiki/Squirtle"));
       listapokemons.add(new cPokemon(8,"@drawable/wartortle", "@drawable/swartortle","Wartortle", "#8", "AGUA", "","Pokemon tortuga","Se oculta en el agua para cazar a sus presas. Al nadar rápidamente, mueve sus orejas para nivelarse.","1.0 m","22.5 kg","Torrente","Cura lluvia","https://pokemon.fandom.com/es/wiki/Wartortle"));
       listapokemons.add(new cPokemon(9,"@drawable/blastoise", "@drawable/sblastoise","Blastoise", "#9", "AGUA", "","Pokemon marisco","Un brutal Pokémon con reactores de agua en su caparazón. Éstos son usados para rápidos placajes.","1.6 m","85.5 kg","Torrente","Cura lluvia","https://pokemon.fandom.com/es/wiki/Blastoise"));
       listapokemons.add(new cPokemon(10,"@drawable/caterpie", "@drawable/scaterpie","Caterpie", "#10", "BICHO", "","Pokemon gusano","Sus cortas patas están recubiertas de ventosas que le permiten subir incansable por muros y cuestas.","0.3 m","2.9 kg","Polvo escudo","Fuga",""));
       listapokemons.add(new cPokemon(11,"@drawable/metapod", "@drawable/ssbulbasaur","Metapod", "#11", "BICHO", "","Pokemon capullo","Este Pokémon es vulnerable al ataque cuando su concha es blanda, dejando expuesto su frágil cuerpo.","0.7 m","9.9 kg","Mudar","","https://pokemon.fandom.com/es/wiki/Metapod"));
       listapokemons.add(new cPokemon(12,"@drawable/butterfree", "@drawable/sbutterfree","Butterfree", "#12", "BICHO", "VOLADOR","Pokemon mariposa","En combate, aletea a gran velocidad para lanzar al aire sus tóxicos polvillos.","1.1 m","32 kg","Ojo compuesto","Cromolente","https://pokemon.fandom.com/es/wiki/Butterfree"));
       listapokemons.add(new cPokemon(13,"@drawable/weedle", "@drawable/sweedle","Weedle", "#13", "BICHO", "VENENO","Pokemon oruga","Fácil de ver por los bosques comiendo hojas. Tiene un aguijón venenoso en la cabeza.","0.3 m","3.2 kg","Polvo escudo","Fuga","https://pokemon.fandom.com/es/wiki/Weddle"));
       listapokemons.add(new cPokemon(14,"@drawable/kakuna", "@drawable/skakuna","Kakuna", "#14", "BICHO", "VENENO","Pokemon capullo","Casi incapaz de moverse, este Pokémon sólo puede endurecer su caparazón para protegerse.","0.6 m","10.0 kg","Mudar","","https://pokemon.fandom.com/es/wiki/Kakuna"));
       listapokemons.add(new cPokemon(15,"@drawable/beedrill", "@drawable/sbeedrill","Beedrill", "#15", "BICHO", "VENENO","Pokemon abeja venenosa","Vuela muy deprisa y ataca con los venenosos y grandes aguijones de su cola y patas delanteras.","1.0 m","29.5 kg","Enjambre","Francotirador","https://pokemon.fandom.com/es/wiki/Beedrill"));
       listapokemons.add(new cPokemon(16,"@drawable/pidgey", "@drawable/spidgey","Pidgey", "#16", "NORMAL", "VOLADOR","Pokemon pajarito","Muy común en bosques y selvas. Aletea al nivel del suelo para levantar la gravilla.","0.3 m","1.8 kg","Vista lince","Sacapecho","https://pokemon.fandom.com/es/wiki/Pidgey"));
       listapokemons.add(new cPokemon(17,"@drawable/pidgeotto", "@drawable/spidgeotto","Pidgeotto", "#17", "NORMAL", "VOLADOR","Pokemon pajaro","Muy protector de su amplio territorio, este Pokémon picoteará ferozmente a todo intruso.","1.1 m","30.0 kg","Vista lince","Sacapecho","https://pokemon.fandom.com/es/wiki/Pidgeotto"));
       listapokemons.add(new cPokemon(18,"@drawable/pidgeot", "@drawable/spidgeot","Pidgeot", "#18", "NORMAL", "VOLADOR","Pokemon pajaro","Cuando caza, vuela muy deprisa a ras del agua, y sorprende a inocentes presas como Magikarp.","1.5 m","39.5 kg","Vista lince","Sacapecho","https://pokemon.fandom.com/es/wiki/Pidgeot"));
       listapokemons.add(new cPokemon(19,"@drawable/rattata", "@drawable/srattata","Rattata", "#19", "NORMAL", "","Pokemon ratón","Cuando ataca lo muerde todo. Pequeño y muy rápido, es muy fácil de ver en muchos sitios.","0.3 m","3.5 kg","Fuga","Entusiasmo","https://pokemon.fandom.com/es/wiki/Rattata"));
       listapokemons.add(new cPokemon(20,"@drawable/raticate", "@drawable/sraticate","Raticate", "#20", "NORMAL", "","Pokemon ratón","Utiliza sus bigotes para equilibrarse. Parece que si son cortados va más despacio.","0.7 m","18.5 kg","Fuga","Entusiasmo","https://pokemon.fandom.com/es/wiki/Raticate"));
       listapokemons.add(new cPokemon(21,"@drawable/spearow", "@drawable/sspearow","Spearow", "#21", "NORMAL", "VOLADOR","Pokemon pajarito","Come bichos en zona de hierba. Agita sus cortas alas muy rápido para mantenerse en el aire.","0.3 m","2.0 kg","Vista lince","Francotirador","https://pokemon.fandom.com/es/wiki/Spearow"));
       listapokemons.add(new cPokemon(22,"@drawable/fearow", "@drawable/sfearow","Fearow", "#22", "NORMAL", "VOLADOR","Pokemon pico","Con sus enormes y magníficas alas, puede seguir volando sin tener que aterrizar para descansar.","1.2 m","38.0 kg","Vista lince","Francotirador","https://pokemon.fandom.com/es/wiki/Fearow"));
       listapokemons.add(new cPokemon(23,"@drawable/ekans", "@drawable/sekans","Ekans", "#23", "VENENO", "","Pokemon serpiente","Es muy silencioso y sigiloso. Come huevos de pájaros como los de Pidgey y Spearow.","2.0 m","6.9 kg","Intimidacion","Nerviosismo","https://pokemon.fandom.com/es/wiki/Ekans"));
       listapokemons.add(new cPokemon(24,"@drawable/arbok", "@drawable/sarbok","Arbok", "#24", "VENENO", "","Pokemon cobra","Se dice que las feroces señales de alerta de su panza difieren de un área a otra.","3.5 m","65.0 kg","Intimidaccion","Nerviosismo","https://pokemon.fandom.com/es/wiki/Arbok"));
       listapokemons.add(new cPokemon(25,"@drawable/pikachu", "@drawable/spikachu","Pikachu", "#25", "ELECTRICO", "","Pokemon ratón","Cuando varios de estos Pokémon se juntan, su energía puede causar fuertes tormentas.","0.4 m","6.0 kg","Electricidad estatica","Pararrayos","https://pokemon.fandom.com/es/wiki/Pikachu"));
       listapokemons.add(new cPokemon(26,"@drawable/raichu", "@drawable/sraichu","Raichu", "#26", "ELECTRICO", "","Pokemon ratón","Cuando la electricidad del cuerpo crece, se vuelve irritable. También brilla en la oscuridad.","0.8 m","30.0 kg","Electricidad estatica","Pararrayos","https://pokemon.fandom.com/es/wiki/Raichu"));
       listapokemons.add(new cPokemon(27,"@drawable/sandshrew","@drawable/ssandshrew", "Sandshrew", "#27", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Sandshrew"));
       listapokemons.add(new cPokemon(28,"@drawable/sandslash", "@drawable/ssandslash", "Sandslash", "#28", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Sandslash"));
       listapokemons.add(new cPokemon(29,"@drawable/nidoranh", "@drawable/snidoranh", "Nidoran♀", "#29", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Nidoran%E2%99%80"));
       listapokemons.add(new cPokemon(30,"@drawable/nidorina", "@drawable/snidorina", "Nidorina", "#30", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Nidorina"));
       listapokemons.add(new cPokemon(31,"@drawable/nidoqueen", "@drawable/snidoqueen", "Nidoqueen", "#31", "VENENO", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Nidoqueen"));
       listapokemons.add(new cPokemon(32,"@drawable/nidoranm", "@drawable/snidoranm", "Nidoran♂", "#32", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Nidoran%E2%99%82"));
       listapokemons.add(new cPokemon(33,"@drawable/nidorino", "@drawable/snidorino", "Nidorino", "#33", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Nidorino"));
       listapokemons.add(new cPokemon(34,"@drawable/nidoking", "@drawable/snidoking", "Nidoking", "#34", "VENENO", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Nidoking"));
       listapokemons.add(new cPokemon(35,"@drawable/clefairy", "@drawable/sclefairy", "Clefairy", "#35", "NORMAL", "HADA","","","","","","","https://pokemon.fandom.com/es/wiki/Clefairy"));
       listapokemons.add(new cPokemon(36,"@drawable/clefable", "@drawable/sclefable", "Clefable", "#36", "NORMAL", "HADA","","","","","","","https://pokemon.fandom.com/es/wiki/Clefable"));
       listapokemons.add(new cPokemon(37,"@drawable/vulpix", "@drawable/svulpix", "Vulpix", "#37", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Vulpix"));
       listapokemons.add(new cPokemon(38,"@drawable/ninetales", "@drawable/sninetales", "Ninetales", "#38", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Ninetales"));
       listapokemons.add(new cPokemon(39,"@drawable/jigglypuff", "@drawable/sjigglypuff", "Jigglypuff", "#39", "NORMAL", "HADA","","","","","","","https://pokemon.fandom.com/es/wiki/Jigglypuff"));
       listapokemons.add(new cPokemon(40,"@drawable/wigglytuff", "@drawable/swigglytuff", "Wigglytuff", "#40", "NORMAL", "HADA","","","","","","","https://pokemon.fandom.com/es/wiki/Wigglytuff"));
       listapokemons.add(new cPokemon(41,"@drawable/zubat", "@drawable/szubat", "Zubat", "#41", "VENENO", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Zubat"));
       listapokemons.add(new cPokemon(42,"@drawable/golbat", "@drawable/sgolbat", "Golbat", "#42", "VENENO", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Golbat"));
       listapokemons.add(new cPokemon(43,"@drawable/oddish", "@drawable/soddish", "Oddish", "#43", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Oddish"));
       listapokemons.add(new cPokemon(44,"@drawable/gloom", "@drawable/sgloom", "Gloom", "#44", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Gloom"));
       listapokemons.add(new cPokemon(45,"@drawable/vileplume", "@drawable/svileplume", "Vileplume", "#45", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Vileplume"));
       listapokemons.add(new cPokemon(46,"@drawable/paras", "@drawable/sparas", "Paras", "#46", "BICHO", "PLANTA","","","","","","","https://pokemon.fandom.com/es/wiki/Paras"));
       listapokemons.add(new cPokemon(47,"@drawable/parasect", "@drawable/sparasect", "Parasect", "#47", "BICHO", "PLANTA","","","","","","","https://pokemon.fandom.com/es/wiki/Parasect"));
       listapokemons.add(new cPokemon(48,"@drawable/venonat", "@drawable/svenonat", "Venonat", "#48", "BICHO", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Venonat"));
       listapokemons.add(new cPokemon(49,"@drawable/venomoth", "@drawable/svenomoth", "Venomoth", "#49", "BICHO", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Venomoth"));
       listapokemons.add(new cPokemon(50,"@drawable/diglett", "@drawable/sdiglett", "Diglett", "#50", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Diglett"));
       listapokemons.add(new cPokemon(51,"@drawable/dugtrio", "@drawable/sdugtrio", "Dugtrio", "#51", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Dugtrio"));
       listapokemons.add(new cPokemon(52,"@drawable/meowth", "@drawable/meowth", "Meowth", "#52", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Meowth"));
       listapokemons.add(new cPokemon(53,"@drawable/persian", "@drawable/spersian", "Persian", "#53", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Persian"));
       listapokemons.add(new cPokemon(54,"@drawable/psyduck", "@drawable/spsyduck", "Psyduck", "#54", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Psyduck"));
       listapokemons.add(new cPokemon(55,"@drawable/golduck", "@drawable/sgolduck", "Golduck", "#55", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Golduck"));
       listapokemons.add(new cPokemon(56,"@drawable/mankey", "@drawable/smankey", "Mankey", "#56", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Mankey"));
       listapokemons.add(new cPokemon(57,"@drawable/primeape", "@drawable/sprimeape", "Primeape", "#57", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Primeape"));
       listapokemons.add(new cPokemon(58,"@drawable/growlithe", "@drawable/sgrowlithe", "Growlithe", "#58", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Growlithe"));
       listapokemons.add(new cPokemon(59,"@drawable/arcanine", "@drawable/sarcanine", "Arcanine", "#59", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Arcanine"));
       listapokemons.add(new cPokemon(60,"@drawable/poliwag", "@drawable/spoliwag", "Poliwag", "#60", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Poliwag"));
       listapokemons.add(new cPokemon(61,"@drawable/poliwhirl", "@drawable/spoliwhirl", "Poliwhirl", "#61", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Pliwhirl"));
       listapokemons.add(new cPokemon(62,"@drawable/poliwrath", "@drawable/spoliwrath", "Poliwrath", "#62", "AGUA", "LUCHA","","","","","","","https://pokemon.fandom.com/es/wiki/Poliwrath"));
       listapokemons.add(new cPokemon(63,"@drawable/abra", "@drawable/sabra", "Abra", "#63", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Abra"));
       listapokemons.add(new cPokemon(64,"@drawable/kadabra", "@drawable/skadabra", "Kadabra", "#64", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Kadabra"));
       listapokemons.add(new cPokemon(65,"@drawable/alakazam", "@drawable/salakazam", "Alakazam", "#65", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Alakazam"));
       listapokemons.add(new cPokemon(66,"@drawable/machop", "@drawable/smachop", "Machop", "#66", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Machop"));
       listapokemons.add(new cPokemon(67,"@drawable/machoke", "@drawable/smachoke", "Machoke", "#67", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Machoke"));
       listapokemons.add(new cPokemon(68,"@drawable/machamp", "@drawable/smachamp", "Machamp", "#68", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Machamp"));
       listapokemons.add(new cPokemon(69,"@drawable/bellsprout", "@drawable/sbellsprout", "Bellsprout", "#69", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Bellsprout"));
       listapokemons.add(new cPokemon(70,"@drawable/weepinbell", "@drawable/sweepinbell", "Weepinbell", "#70", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Weepinbell"));
       listapokemons.add(new cPokemon(71,"@drawable/victreebel", "@drawable/svictreebel", "Victreebel", "#71", "PLANTA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Victreebel"));
       listapokemons.add(new cPokemon(72,"@drawable/tentacool", "@drawable/stentacool", "Tentacool", "#72", "AGUA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Tentacool"));
       listapokemons.add(new cPokemon(73,"@drawable/tentacruel", "@drawable/stentacruel", "Tentacruel", "#73", "AGUA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Tentacruel"));
       listapokemons.add(new cPokemon(74,"@drawable/geodude", "@drawable/sgeodude", "Geodude", "#74", "ROCA", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Geodude"));
       listapokemons.add(new cPokemon(75,"@drawable/graveler", "@drawable/sgraveler", "Graveler", "#75", "ROCA", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Graveler"));
       listapokemons.add(new cPokemon(76,"@drawable/golem", "@drawable/sgolem", "Golem", "#76", "ROCA", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Golem"));
       listapokemons.add(new cPokemon(77,"@drawable/ponyta","@drawable/sponyta", "Ponyta", "#77", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Ponyta"));
       listapokemons.add(new cPokemon(78,"@drawable/rapidash","@drawable/srapidash", "Rapidash", "#78", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Rapidash"));
       listapokemons.add(new cPokemon(79,"@drawable/slowpoke","@drawable/sslowpoke", "Slowpoke", "#79", "AGUA", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Slowpoke"));
       listapokemons.add(new cPokemon(80,"@drawable/slowbro","@drawable/sslowbro", "Slowbro", "#80", "AGUA", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Slowbro"));
       listapokemons.add(new cPokemon(81,"@drawable/magnemite","@drawable/smagnemite", "Magnemite", "#81", "ELECTRICO", "ACERO","","","","","","","https://pokemon.fandom.com/es/wiki/Magnemite"));
       listapokemons.add(new cPokemon(82,"@drawable/magneton","@drawable/smagneton", "Magneton", "#82", "ELECTRICO", "ACERO","","","","","","","https://pokemon.fandom.com/es/wiki/Magneton"));
       listapokemons.add(new cPokemon(83,"@drawable/farfetch","@drawable/sfarfetch", "Farfetch'd", "#83", "NORMAL", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Farfetch%27d"));
       listapokemons.add(new cPokemon(84,"@drawable/doduo","@drawable/sdoduo", "Doduo", "#84", "NORMAL", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Doduo"));
       listapokemons.add(new cPokemon(85,"@drawable/dodrio","@drawable/sdodrio", "Dodrio", "#85", "NORMAL", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Dodrio"));
       listapokemons.add(new cPokemon(86,"@drawable/seel","@drawable/sseel", "Seel", "#86", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Seel"));
       listapokemons.add(new cPokemon(87,"@drawable/dewgong","@drawable/sdewgong", "Dewgong", "#87", "AGUA", "HIELO","","","","","","","https://pokemon.fandom.com/es/wiki/Dewong"));
       listapokemons.add(new cPokemon(88,"@drawable/grimer","@drawable/sgrimer", "Grimer", "#88", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Grimer"));
       listapokemons.add(new cPokemon(89,"@drawable/muk","@drawable/smuk", "Muk", "#89", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Muk"));
       listapokemons.add(new cPokemon(90,"@drawable/shellder","@drawable/sshellder", "Shellder", "#90", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Shellder"));
       listapokemons.add(new cPokemon(91,"@drawable/cloyster","@drawable/scloyster", "Cloyster", "#91", "AGUA", "HIELO","","","","","","","https://pokemon.fandom.com/es/wiki/Cloyster"));
       listapokemons.add(new cPokemon(92,"@drawable/gastly","@drawable/sgastly", "Gastly", "#92", "FANTASMA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Gastly"));
       listapokemons.add(new cPokemon(93,"@drawable/haunter","@drawable/shaunter", "Haunter", "#93", "FANTASMA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Haunter"));
       listapokemons.add(new cPokemon(94,"@drawable/gengar","@drawable/sgengar", "Gengar", "#94", "FANTASMA", "VENENO","","","","","","","https://pokemon.fandom.com/es/wiki/Gengar"));
       listapokemons.add(new cPokemon(95,"@drawable/onix", "@drawable/sonix","Onix", "#95", "ROCA", "TIERRA","","","","","","","https://pokemon.fandom.com/es/wiki/Onix"));
       listapokemons.add(new cPokemon(96,"@drawable/drowzee","@drawable/sdrowzee", "Drowzee", "#96", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Drowzee"));
       listapokemons.add(new cPokemon(97,"@drawable/hypno","@drawable/shypno", "Hypno", "#97", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Hypno"));
       listapokemons.add(new cPokemon(98,"@drawable/krabby","@drawable/skrabby", "Krabby", "#98", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Krabby"));
       listapokemons.add(new cPokemon(99,"@drawable/kingler","@drawable/skingler", "Kingler", "#99", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Kingler"));
       listapokemons.add(new cPokemon(100,"@drawable/voltorb","@drawable/svoltorb", "Voltorb", "#100", "ELECTRICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Voltorb"));
       listapokemons.add(new cPokemon(100,"@drawable/electrode","@drawable/selectrode", "Electrode", "#101", "ELECTRICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Electrode"));
       listapokemons.add(new cPokemon(100,"@drawable/exeggcute","@drawable/sexeggcute", "Exeggcute", "#102", "PLANTA", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Exeggcute"));
       listapokemons.add(new cPokemon(100,"@drawable/exeggutor","@drawable/sexeggutor", "Exeggutor", "#103", "PLANTA", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Exeggutor"));
       listapokemons.add(new cPokemon(100,"@drawable/cubone","@drawable/scubone", "Cubone", "#104", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Cubone"));
       listapokemons.add(new cPokemon(100,"@drawable/marowak","@drawable/smarowak", "Marowak", "#105", "TIERRA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Marowak"));
       listapokemons.add(new cPokemon(100,"@drawable/hitmonlee","@drawable/shitmonlee", "Hitmonlee", "#106", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Hitmonlee"));
       listapokemons.add(new cPokemon(100,"@drawable/hitmonchan","@drawable/shitmonchan", "Hitmonchan", "#107", "LUCHA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Hitmonchan"));
       listapokemons.add(new cPokemon(100,"@drawable/lickitung","@drawable/slickitung", "Lickitung", "#108", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Lickitung"));
       listapokemons.add(new cPokemon(100,"@drawable/koffing", "@drawable/skoffing","Koffing", "#109", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Koffing"));
       listapokemons.add(new cPokemon(110,"@drawable/weezing","@drawable/sweezing", "Weezing", "#110", "VENENO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Weezing"));
       listapokemons.add(new cPokemon(111,"@drawable/rhyhorn", "@drawable/srhyhorn","Rhyhorn", "#111", "TIERRA", "ROCA","","","","","","","https://pokemon.fandom.com/es/wiki/Rhyhorn"));
       listapokemons.add(new cPokemon(112,"@drawable/rhydon", "@drawable/srhydon","Rhydon", "#112", "TIERRA", "ROCA","","","","","","","https://pokemon.fandom.com/es/wiki/Rhydon"));
       listapokemons.add(new cPokemon(113,"@drawable/chansey","@drawable/schansey", "Chansey", "#113", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Chansey"));
       listapokemons.add(new cPokemon(114,"@drawable/tangela","@drawable/stangela", "Tangela", "#114", "PLANTA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Kangaskhan"));
       listapokemons.add(new cPokemon(115,"@drawable/kangaskhan","@drawable/skangaskhan", "Kangaskhan", "#115", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/"));
       listapokemons.add(new cPokemon(116,"@drawable/horsea", "@drawable/shorsea","Horsea", "#116", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Horsea"));
       listapokemons.add(new cPokemon(117,"@drawable/seadra", "@drawable/sseadra","Seadra", "#117", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Seadra"));
       listapokemons.add(new cPokemon(118,"@drawable/goldeen","@drawable/sgoldeen", "Goldeen", "#118", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Goldeen"));
       listapokemons.add(new cPokemon(119,"@drawable/seaking","@drawable/sseaking", "Seaking", "#119", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Seaking"));
       listapokemons.add(new cPokemon(120,"@drawable/staryu","@drawable/sstaryu", "Staryu", "#120", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Staryu"));
       listapokemons.add(new cPokemon(121,"@drawable/starmie","@drawable/sstarmie", "Starmie", "#121", "AGUA", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Starmie"));
       listapokemons.add(new cPokemon(122,"@drawable/mrmime","@drawable/smrmime", "Mr. Mime", "#122", "PSIQUICO", "HADA","","","","","","","https://pokemon.fandom.com/es/wiki/Mr._Mime"));
       listapokemons.add(new cPokemon(123,"@drawable/scyther","@drawable/sscyther", "Scyther", "#123", "bicho", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Scyther"));
       listapokemons.add(new cPokemon(124,"@drawable/jynx","@drawable/sjynx", "Jynx", "#124", "HIELO", "PSIQUICO","","","","","","","https://pokemon.fandom.com/es/wiki/Jynx"));
       listapokemons.add(new cPokemon(125,"@drawable/electabuzz","@drawable/selectabuzz", "Electabuzz", "#125", "ELECTRICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Electabuzz"));
       listapokemons.add(new cPokemon(126,"@drawable/magmar","@drawable/smagmar", "Magmar", "#126", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Magmar"));
       listapokemons.add(new cPokemon(127,"@drawable/pinsir","@drawable/spinsir", "Pinsir", "#127", "BICHO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Pinsir"));
       listapokemons.add(new cPokemon(128,"@drawable/tauros","@drawable/stauros", "Tauros", "#128", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Tauros"));
       listapokemons.add(new cPokemon(129,"@drawable/magikarp","@drawable/smagikarp", "Magikarp", "#129", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Magikarp"));
       listapokemons.add(new cPokemon(130,"@drawable/gyarados","@drawable/sgyarados", "Gyarados", "#130", "AGUA", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Gyarados"));
       listapokemons.add(new cPokemon(131,"@drawable/lapras","@drawable/slapras", "Lapras", "#131", "AGUA", "HIELO","","","","","","","https://pokemon.fandom.com/es/wiki/Lapras"));
       listapokemons.add(new cPokemon(132,"@drawable/ditto","@drawable/sditto", "Ditto", "#132", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Ditto"));
       listapokemons.add(new cPokemon(133,"@drawable/eevee","@drawable/seevee", "Eevee", "#133", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Eevee"));
       listapokemons.add(new cPokemon(134,"@drawable/vaporeon","@drawable/svaporeon", "Vaporeon", "#134", "AGUA", "","","","","","","","https://pokemon.fandom.com/es/wiki/Vaporeon"));
       listapokemons.add(new cPokemon(135,"@drawable/jolteon","@drawable/sjolteon", "Jolteon", "#135", "ELECTRICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Jolteon"));
       listapokemons.add(new cPokemon(136,"@drawable/flareon","@drawable/sflareon", "Flareon", "#136", "FUEGO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Flareon"));
       listapokemons.add(new cPokemon(137,"@drawable/porygon","@drawable/sporygon", "Porygon", "#137", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Porygon"));
       listapokemons.add(new cPokemon(138,"@drawable/omanyte","@drawable/somanyte", "Omanyte", "#138", "ROCA", "AGUA","","","","","","","https://pokemon.fandom.com/es/wiki/Omanyte"));
       listapokemons.add(new cPokemon(139,"@drawable/omastar","@drawable/somastar", "Omastar", "#139", "ROCA", "AGUA","","","","","","","https://pokemon.fandom.com/es/wiki/Omastar"));
       listapokemons.add(new cPokemon(140,"@drawable/kabuto","@drawable/skabuto", "Kabuto", "#140", "ROCA", "AGUA","","","","","","","https://pokemon.fandom.com/es/wiki/Kabuto"));
       listapokemons.add(new cPokemon(141,"@drawable/kabutops","@drawable/skabutops", "Kabutops", "#141", "ROCA", "AGUA","","","","","","","https://pokemon.fandom.com/es/wiki/Kabutops"));
       listapokemons.add(new cPokemon(142,"@drawable/aerodactyl","@drawable/saerodactyl", "Aerodactyl", "#142", "ROCA", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Aerodactyl"));
       listapokemons.add(new cPokemon(143,"@drawable/snorlax","@drawable/ssnorlax", "Snorlax", "#143", "NORMAL", "","","","","","","","https://pokemon.fandom.com/es/wiki/Snorlax"));
       listapokemons.add(new cPokemon(144,"@drawable/articuno","@drawable/sarticuno", "Articuno", "#144", "HIELO", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Articuno"));
       listapokemons.add(new cPokemon(145,"@drawable/zapdos","@drawable/szapdos", "Zapdos", "#145", "ELECTRICO", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Zapdos"));
       listapokemons.add(new cPokemon(146,"@drawable/moltres","@drawable/smoltres", "Moltres", "#146", "FUEGO", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Moltres"));
       listapokemons.add(new cPokemon(147,"@drawable/dratini","@drawable/sdratini", "Dratini", "#147", "DRAGON", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Dratini"));
       listapokemons.add(new cPokemon(148,"@drawable/dragonair","@drawable/sdragonair", "Dragonair", "#148", "DRAGON", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Dragonair"));
       listapokemons.add(new cPokemon(149,"@drawable/dragonite","@drawable/sdragonite", "Dragonite", "#149", "DRAGON", "VOLADOR","","","","","","","https://pokemon.fandom.com/es/wiki/Dragonite"));
       listapokemons.add(new cPokemon(150,"@drawable/mewtwo","@drawable/smewtwo", "Mewtwo", "#150", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Mewtwo"));
       listapokemons.add(new cPokemon(151,"@drawable/mew","@drawable/smew", "Mew", "#151", "PSIQUICO", "","","","","","","","https://pokemon.fandom.com/es/wiki/Mew"));

        // Construim l'adaptador utilitzant un layout per defecte de Android.
        final AdaptadorPokemon adaptador = new AdaptadorPokemon(this, listapokemons);

        // Assignem al listview l'adaptador creat
        lst = (ListView) findViewById(R.id.LstOpciones);
        lst.setAdapter(adaptador);

        btn_terminar = findViewById(R.id.btn_terminar);

        btn_terminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        // deshabilita la barra de notificacions
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Capturem el clic d'un element de la listview
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> a, View v, int position, long id) {

                cPokemon element = (cPokemon) a.getItemAtPosition(position);

                Intent detalle = new Intent(listaPokemons.this, info_pokemon.class);
                detalle.putExtra("nombre", element.getNombre());
                detalle.putExtra("numero", element.getNumero());
                detalle.putExtra("descripcion", element.getDescripcion());
                detalle.putExtra("tipo1", element.getTipo1());
                detalle.putExtra("tipo2", element.getTipo2());
                detalle.putExtra("altura", element.getAltura());
                detalle.putExtra("peso", element.getPeso());
                detalle.putExtra("habilidad", element.getHabilidad());
                detalle.putExtra("habilidadOculta", element.getHabilidadOculta());
                detalle.putExtra("tipopokemon", element.getTipoPokemon());
                detalle.putExtra("url", element.getUrl());
                detalle.putExtra("foto", element.getFoto());

                startActivity(detalle);
            }




        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button

            case R.id.HOME:
                finish();
                return true;

            case R.id.JUGAR:

                final Intent intentJuego = new Intent(this, PreguntaPokemon.class);
                startActivity(intentJuego);
                return true;

            case R.id.TODOS:
                Toast.makeText(this,"Seleccion: TODOS", Toast.LENGTH_LONG).show();
                filtro("TODOS");
                return true;

            case R.id.AGUA:
                Toast.makeText(this,"Seleccion: AGUA", Toast.LENGTH_LONG).show();
                filtro("AGUA");
                return true;

            case R.id.PLANTA:
                Toast.makeText(this,"Seleccion: PLANTA", Toast.LENGTH_LONG).show();
                filtro("PLANTA");
                return true;

            case R.id.FUEGO:
                Toast.makeText(this,"Seleccion: FUEGO", Toast.LENGTH_LONG).show();
                filtro("FUEGO");
                return true;

            case R.id.ELECTRICO:
                Toast.makeText(this,"Seleccion: ELECTRICO", Toast.LENGTH_LONG).show();
                filtro("ELECTRICO");
                return true;

            case R.id.TIERRA:
                Toast.makeText(this,"Seleccion: TIERRA", Toast.LENGTH_LONG).show();
                filtro("TIERRA");
                return true;

            case R.id.ROCA:
                Toast.makeText(this,"Seleccion: ROCA", Toast.LENGTH_LONG).show();
                filtro("ROCA");
                return true;

            case R.id.FANTASMA:
                Toast.makeText(this,"Seleccion: FANTASMA", Toast.LENGTH_LONG).show();
                filtro("FANTASMA");
                return true;

            case R.id.SINIESTRO:
                Toast.makeText(this,"Seleccion: SINIESTRO", Toast.LENGTH_LONG).show();
                filtro("SINIESTRO");
                return true;

            case R.id.VENENO:
                Toast.makeText(this,"Seleccion: VENENO", Toast.LENGTH_LONG).show();
                filtro("VENENO");
                return true;

            case R.id.HADA:
                Toast.makeText(this,"Seleccion: HADA", Toast.LENGTH_LONG).show();
                filtro("HADA");
                return true;

            case R.id.DRAGON:
                Toast.makeText(this,"Seleccion: DRAGON", Toast.LENGTH_LONG).show();
                filtro("DRAGON");
                return true;

            case R.id.HIELO:
                Toast.makeText(this,"Seleccion: HIELO", Toast.LENGTH_LONG).show();
                filtro("HIELO");
                return true;

            case R.id.ACERO:
                Toast.makeText(this,"Seleccion: ACERO", Toast.LENGTH_LONG).show();
                filtro("ACERO");
                return true;

            case R.id.BICHO:
                Toast.makeText(this,"Seleccion: BICHO", Toast.LENGTH_LONG).show();
                filtro("BICHO");
                return true;

            case R.id.VOLADOR:
                Toast.makeText(this,"Seleccion: VOLADOR", Toast.LENGTH_LONG).show();
                filtro("VOLADOR");
                return true;

            case R.id.LUCHA:
                Toast.makeText(this,"Seleccion: LUCHA", Toast.LENGTH_LONG).show();
                filtro("LUCHA");
                return true;

            case R.id.PSIQUICO:
                Toast.makeText(this,"Seleccion: PSIQUICO", Toast.LENGTH_LONG).show();
                filtro("PSIQUICO");
                return true;

            case R.id.NORMAL:
                Toast.makeText(this,"Seleccion: NORMAL", Toast.LENGTH_LONG).show();
                filtro("NORMAL");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void filtro(String tipo){

        ArrayList<cPokemon> listaPokemon2 = new ArrayList<>();

        List<cPokemon> list = listapokemons;

        for(int i = 0; i < list.size(); i++){
            cPokemon pokemon = list.get(i);
            if(tipo == "TODOS"){
                listaPokemon2.addAll(listapokemons);
                break;
            }
            else if(pokemon.getTipo1().equals(tipo) || pokemon.getTipo2().equals(tipo)){
                listaPokemon2.add(pokemon);

            }
        }

        AdaptadorPokemon adaptador2 = new AdaptadorPokemon(this, listaPokemon2);
        lst.setAdapter(adaptador2);

    }

    class AdaptadorPokemon extends ArrayAdapter<cPokemon> {

        public AdaptadorPokemon(Context context, ArrayList<cPokemon> listapokemons) {
            super(context, R.layout.activity_main2, listapokemons);
        }
        public String dimeColorTipo(String tipo) {

            String color = null;

            switch (tipo) {

                case "PLANTA":
                    color="#1ABB0D";
                    break;
                case "VENENO":
                    color="#A90DBB";
                    break;
                case "FUEGO":
                    color="#F05030";
                    break;
                case "AGUA":
                    color="#3899F8";
                    break;
                case "VOLADOR":
                    color="#98A8F0";
                    break;
                case "ROCA":
                    color="#B8A058";
                    break;
                case "TIERRA":
                    color="#DEC054";
                    break;
                case "HADA":
                    color="#E79FE7";
                    break;
                case "BICHO":
                    color="#A8B820";
                    break;
                case "SINIESTRO":
                    color="#7A5848";
                    break;
                case "PSIQUICO":
                    color="#F870A0";
                    break;
                case "ACERO":
                    color="#A8A8C0";
                    break;
                case "HIELO":
                    color="#58C8E0";
                    break;
                case "LUCHA":
                    color="#A05038";
                    break;
                case "NORMAL":
                    color="#A8A090";
                    break;
                case "FANTASMA":
                    color="#6060B0";
                    break;
                case "ELECTRICO":
                    color="#F8D030";
                    break;
                case "DRAGON":
                    color="#7860E0";
                    break;

                    default:
                        color="#00FFFFFF";
                        break;

            }
            return color;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_main2, null);

            cPokemon Pokemon = (cPokemon) getItem(position);

            ImageView foto = (ImageView) item.findViewById(R.id.foto);
            String src = Pokemon.getFoto();
            foto.setImageResource(getResources().getIdentifier(src, "drawable", getOpPackageName()));

            TextView edt = (TextView) item.findViewById(R.id.edtNombre);
            edt.setText(Pokemon.getNombre());

            edt = (TextView) item.findViewById(R.id.edtNumero);
            edt.setText(Pokemon.getNumero());

            edt = (TextView) item.findViewById(R.id.edtTipo1);
            edt.setBackgroundColor(Color.parseColor(dimeColorTipo(Pokemon.getTipo1())));
            edt.setText(Pokemon.getTipo1());

            edt = (TextView) item.findViewById(R.id.edtTipo2);
            edt.setBackgroundColor(Color.parseColor(dimeColorTipo(Pokemon.getTipo2())));
            edt.setText(Pokemon.getTipo2());

            return (item);
        }

    }
}


