package com.example.anonimo1.turismocordoba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {

    Intent intent;
    Bundle bundle;
    Sitio sitio;
    private ArrayList<Sitio>sitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);

        ListView list = (ListView)findViewById(R.id.gridview);

        sitios = new ArrayList<>();
        annadirSitios();

        MyListAdapter adapter = new MyListAdapter(this,sitios);

        list.setAdapter(adapter);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
    }

    private void annadirSitios() {
       sitios.add(new Sitio(R.drawable.alcazar, "Álcazar de los Reyes Cristianos", "Es un edificio de carácter militar ordenado construir por el rey Alfonso XI de" +
               " Castilla en el año 1328, sobre construcciones anteriores (el Alcázar andalusí, antes residencia del Gobernador Romano y la Aduana, ubicada en " +
               "uno de los márgenes del río Guadalquivir), en Córdoba, España. El conjunto arquitectónico tiene un carácter sobrio en su exterior y espléndido en " +
               "su interior, con los magníficos jardines y patios que mantienen una inspiración mudéjar.\nEl Alcázar está declarado Bien de interés cultural desde " +
               "el año 1931. Forma parte del centro histórico de Córdoba que fue declarado Patrimonio de la Humanidad por la Unesco en 1994", "Tras la conquista castellana " +
               "de la ciudad, el solar ocupado por el antiguo alcázar andalusí fue repartido entre el rey Fernando III, el obispo, algunos nobles y la orden de Calatrava. Fue " +
               "decidida su fortificación entre el año 1328 y 1329, por el rey castellano, Alfonso XI, sobre construcciones anteriores.\n Alojamiento de reyes en sus estancias " +
               "de Córdoba, los Reyes Católicos pasaron más de ocho años en la fortaleza, dirigiendo desde la misma, la campaña contra el Reino de Granada. En estas mismas " +
               "dependencias (Torre del Homenaje), Cristóbal Colón solicitó fondos para su aventura marítima en el año 1486, así como vieron nacimiento uno de sus hijos, la " +
               "infanta doña María, futura reina de Portugal.\n Tras la campaña de Granada y la finalización de las campañas contra los musulmanes en España, los Reyes Católicos" +
               " cedieron el inmueble a las autoridades eclesiásticas, las cuales lo convirtieron en Tribunal del Santo Oficio, perdiendo entonces su carácter palaciego. En 1812," +
               " y tras la abolición por parte de las Cortes Constituyentes de Cádiz del Tribunal de la Inquisición, se convirtió en cárcel civil hasta que en el año 1931, " +
               "se destinó a instalaciones militares, los cuales lo cedideron en el año 1955 al Ayuntamiento de Córdoba.\n Actualmente el Alcázar es sede de diferentes eventos " +
               "municipales, como la celebración de bodas civiles impartidas por diferentes ediles cordobeses, así como ser sede de eventos municipales, así como sede y " +
               "exposición de presentaciones varias."));
       sitios.add(new Sitio(R.drawable.mezquita, "Mezquita-Catedral", "Actualmente conocida como la Catedral de la Asunción de Nuestra Señora de forma eclesiástica, o simplemente" +
               " Mezquita de Córdoba de forma general, es un edificio de la ciudad de Córdoba, España. Se trata de uno de los monumentos más importantes de la arquitectura " +
               "islámica en España, así como del más emblemático ejemplo de arte omeya hispanomusulmán. Desde el siglo XIII y hasta la actualidad es un templo católico, la " +
               "iglesia catedral de la diócesis de Córdoba. Está declarado Patrimonio Cultural de la Humanidad como parte del centro histórico de la ciudad", "Tras la llegada del " +
               "islam a Córdoba, la basílica visigótica de San Vicente, que había sido el templo cristiano más importante de la ciudad desde el siglo V, en las capitulaciones de " +
               "Córdoba fue apropiado parcialmente por los musulmanes. Aunque existen relatos que mencionan una supuesta compra del templo por parte de los musulmanes, su " +
               "credibilidad queda descartada desde el momento en que Muza se había apropiado del mismo durante la ocupación de Córdoba y el hecho de que la parte no ocupada por " +
               "los musulmanes fuese utilizada como patio de ejecuciones en diversas ocasiones"));
       sitios.add(new Sitio(R.drawable.plazatoros, "Plaza de toros 'Los Califas' ", "Tiene capacidad para 16.900 espectadores1 y está considerada como plaza de 1ª Categoría. Es " +
               "gestionada por la empresa Ramguertauro", "Fue inaugurada el 9 de mayo de 1965, con una corrida a beneficio de la Asociación Española Contra el Cáncer, organizada " +
               "por el entonces presidente de esa Asociación, el ingeniero Fernando Carbonell de León. Participaron los matadores Manuel Benítez \"El Cordobés\", que toreó sin cobrar" +
               " , José María Montilla y Zurito, lidiando reses de Carlos Núñez.\n Su origen se encuentra en 1963, cuando un grupo de cordobeses fundaron una sociedad para promover su " +
               "construcción: José Rodríguez Jiménez, José Gómez Salmoral, José Pérez Barquero, Rafael Guerra Sánchez, Rafael Marchal Ceballos y Manuel Navas Quero. " +
               "Así con el proyecto de José Rebollo Dicenta y su dirección técnica, se inician las obras en el mes de junio. El nombre de Los Califas es en honor de los cinco grandes " +
               "matadores de la provincia: Lagartijo, Guerrita, Machaquito, Manolete y el Cordobés. Este último fue quinto Califa en 2002"));
       sitios.add(new Sitio(R.drawable.puenteromano, "Puente romano", "Consta de dieciséis arcos, cuatro apuntados y el resto de medio punto. está situado sobre el río " +
               "Guadalquivir a su paso por Córdoba, y une el barrio del Campo de la Verdad con el Barrio de la Catedral. También conocido como \"el Puente Viejo\" fue el único " +
               "puente con que contó la ciudad durante 20 siglos, hasta la construcción del puente de San Rafael, a mediados del siglo XX. El 9 de enero de 2008 se inauguró la " +
               "mayor y discutida remodelación que el puente Romano ha tenido en su historia", "Construido a principios del siglo I d.C., durante la época de dominación romana en " +
               "Córdoba, sobre el río Guadalquivir (probablemente sustituyendo a uno más primitivo de madera), tiene una longitud de unos 331 metros y está compuesto por 16 arcos, " +
               "aunque originalmente tuvo 17. Fue uno de los más importantes medios de entrada a la ciudad desde la zona sur de la península Ibérica por ser el único punto para " +
               "cruzar el río sin utilizar ningún tipo de embarcación. Probablemente la Vía Augusta que iba desde Roma hasta Cádiz pasaba por él.\n Desde la época de la dominación" +
               " musulmana encontramos en su extremo Sur la torre defensiva de la Calahorra y en su extremo Norte la Puerta del Puente. Ésta es también llamada erróneamente por el " +
               "pueblo cordobés como Arco del Triunfo, porque nunca fue un Arco del Triunfo, sino una de las puertas de la antigua muralla. La actual Puerta del Puente fue realizada " +
               "por el arquitecto Hernán Ruiz II en 1572. En el centro del puente se encuentra un triunfo del San Rafael, que data de 1651, obra del escultor Bernabé Gómez del Río.\n" +
               " En tiempos más recientes, el Puente Romano se convirtió en el acceso de entrada a la ciudad para los viajeros que acudían desde el sur de la misma. No en vano, se " +
               "situaba al final del puente, en la Puerta del Puente, el fielato sur de la ciudad (Oficina a la entrada de las poblaciones en la cual se pagaban los derechos de consumo). " +
               "Además, el Puente Romano fue parte integrante de la Carretera Nacional IV, siendo atravesado por los viajeros que bajaban desde el centro de España hacia la zona sur y " +
               "viceversa.\n El 1 de mayo de 2004 fue convertido en un puente peatonal, vedándose al tráfico motorizado"));
        sitios.add(new Sitio(R.drawable.sinagogacordoba, "Sinagoga", "Es un templo hebreo localizado en la calle Judíos de la judería de la ciudad de Córdoba (España). Es la " +
                "única sinagoga existente en Andalucía y una de las únicas tres que se conservan en España de esa época, junto a la Sinagoga del Tránsito y la de Santa María la " +
                "Blanca. El 24 de enero de 1885 fue declarada Bien de Interés Cultural en la categoría de monumento. Forma parte del centro histórico de Córdoba que fue declarado" +
                " Patrimonio de la Humanidad por la Unesco en 1994.", "Este templo fue construido en el año 1315 (5075 del calendario judío) por el alarife Isaq Moheb, según reza la " +
                "inscripción fundacional que se conserva en el interior.\nLuego de la expulsión de los judíos en 1492, el edificio se transformó en el hospital de hidrófobos de Santa " +
                "Quiteria. Más tarde, en 1588 se usó como Ermita de San Crispín y San Crispiniano, patronos del gremio de zapateros. Ya en el siglo XIX se empieza a usar como escuela " +
                "de párvulos.\n En 1884, realizándose unas reparaciones en el edificio, Rafael Romero Barros, padre del famoso pintor cordobés Julio Romero de Torres, descubrió restos de" +
                " escritura hebrea lo que llevó a que, en el año siguiente, se declarara al monumento como Bien de Interés Cultural.\n Desde entonces pasó por varias fases de restauración " +
                "como la del arquitecto Don Félix Hernández en 1928 y las iniciadas en 1977 hasta llegar a la reapertura del edificio en 1985 con motivo de la celebración del 850 " +
                "aniversario de nacimiento de Maimónides."));
        sitios.add(new Sitio(R.drawable.temploromano, "Templo romano", "Fue descubierto en los años 1950 durante la ampliación del ayuntamiento. Se encuentra situado en el ángulo formado " +
                "por las calles Claudio Marcelo y Capitulares. No es el único templo que tuvo la ciudad, pero sí fue posiblemente el más importante de todos, así como el único conocido por " +
                "excavación arqueológica. Es un templo pseudoperíptero, hexástilo y de orden corintio de 32 metros de largo por 16 de ancho.", "El templo fue construido a lo largo de la segunda " +
                "mitad del siglo I. El conjunto comenzó a construirse en época del emperador Claudio (41-54) aunque no se culminaría hasta el reinado de Domiciano (81-96), momento en el " +
                "que se le dota de agua. Sufrió algunas modificaciones en el siglo II, reformas que parecen coincidir con el cambio de ubicación del foro provincial que se traslada al " +
                "entorno del actual Convento de Santa Ana. Los materiales empleados en su construcción fueron variados.\n El material empleado fue casi exclusivamente mármol, desde las " +
                "columnas a los muros, pasando por la cubierta y el entablamento. La calidad del mármol y la de la talla del mismo nos hablan de que su construcción fue llevada a cabo por" +
                " artesanos con altísima cualificación, situando el resultado al nivel de los más bellos edificios del imperio.\n El templo se situó en el límite de la Colonia Patricia, " +
                "en la zona donde se ubicaba parte del lienzo oeste de la muralla. Las construcciones del interior, al igual que el lienzo de muralla, fueron destruidos para levantar el " +
                "templo. El terreno fue allanado, creándose una terraza artificial donde se dispuso una plaza en medio de la cual se dispuso el templo.\n La plaza estaba cerrada en tres de " +
                "sus lados, el norte, este y sur (así lo indícan los restos encontrados bajo el edificio situado en la esquina de Claudio Marcelo con Diario Córdoba, mientras que la oeste " +
                "quedaba abierta para conectar visualmente con el circo."));
        sitios.add(new Sitio(R.drawable.torremalmuerta, "Torre de la Malmuerta", "Es una torre albarrana situada en el barrio de Santa Marina de Córdoba, (España). Fue construida a principios " +
                "del siglo XV y tardó cuatro años en edificarse.", "Se comenzó a edificar en 1404, terminándose en 1408, y se construyó sobre los restos de una torre musulmana. " +
                "Su misión consistía en defender las puertas del Rincón y del Colodro. Su construcción fue encargada por el rey Enrique III de Castilla al primer corregidor de la" +
                " ciudad de Córdoba, Penedro Sánchez. Bajo el arco se pueden observar las armas reales y una inscripción que ya se leía con dificultad en 1873, y que aparecía " +
                "recogida en el libro Paseos por Córdoba, dice así:\n\n\n \t\"En el nombre de Dios: porque los buenos fechos de los Reyes no se olviden, esta torre mandó facer " +
                "el muy poderoso Rey Don Henrique, é comenzóse á sentar en el año de nuestro Señor Jeso Christo de M.CCCCVI años, é sendo Obispo Don Fernando Deza, é oficiales " +
                "por el Rey Diego Fernández, Mariscal, Alguacil Mayor, el Doctor Luis Sánchez, Corregidor, é regidores Fernando Díaz de Cabrera é Ruy Gutiérrez... é Ruy Alfonso" +
                "... de Albolafia, é Fernan Gómez, é acabose en el año de M.CCCCVIII años.\"\n\n\n Perdida su función defensiva, se utilizó como prisión para nobles. Después, " +
                "en el siglo XVIII, el sabio cordobés Gonzalo Antonio Serrano realizaba sus observaciones astronómicas desde ella. Durante algún tiempo a finales del siglo XX " +
                "fue sede de la Federación de Ajedrez."));
    }
}
