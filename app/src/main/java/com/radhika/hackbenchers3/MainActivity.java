package com.radhika.hackbenchers3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    String amphibians[] = {"amphibians", "frogs", "salamanders", "caecilian", "diplocaulus", "amphiuma", "labyrinthodontia", "anthracosauria",
            "pacific giant salamanders", "torrent salamanders", "toads", "american bullfrogs", "american toad", "european green toad",
            "giant marine toads", "golden mantella", "green-and-black poison dart frogs", "mountain chickens", "panamanian golden frogs",
            "plains leopard frogs", "puerto rican crested", "surinam toads", "tomato frogs", "vietnamese moss frogs", "waxy tree frogs",
            "white's tree frogs", "wyoming toads", "newts", "alligator newts", "blue-tailed fire-bellied", "emperor newts",
            "fire salamanders", "hellbender", "iberian ribbed newts", "marbled salamanders", "mudpuppy", "three-toed amphiuma",
            "tiger salamanders", "western lesser siren"
    };

    String fish[] = {"fish", "fishes", "goldfish", "siamese", "fighting fish", "iridescent", "sharks", "wels catfish", "barramundi", "atlantic cods", "zander",
            "green swordtail", "freshwater angelfish", "blobfish", "perch", "osca", "haddock", "arapaima gigas", "pollock", "burbot",
            "flathead grey mullets", "rainbow trouts", "great white sharks", "southern platyfish", "coho salmons", "turbots", "common breams",
            "ocean sunfish", "swordfish", "beluga", "pink salmons", "sockeye salmons", "tench", "brown trouts", "whale sharks", "whales",
            "nile tilapia", "blue tangs", "red lionfish", "largemouth bass", "catfish", "arapaima gigas", "tilapia", "cods", "bigeye tunas",
            "great white sharks", "tunas", "halibuts"};

    String premammals[] = {"premammals", "diprotodons", "gigantopithecus", "andrewsarchus", "saber-toothed tigers", "mammuthus primigeniu", "elasmotheriums",
            "entelodonts", "irish elks", "glyptodon", "american cheetahs", "american lions", "neanderthals", "even-toed ungulates",
            "aurochs", "deinotheriums", "eurasian cave lions", "marsupial lions", "procoptodons", "smilodon populators", "palorchestes",
            "gomphotheriums", "platybelodons", "sivatheriums", "pakicetus", "dinofelis", "steppe mammoths"};

    String reptiles[] = {"reptiles", "agamids", "alligators", "blind snakes" ,"boas", "caimans", "carapaces", "chameleons", "cobras", "constrictors" , "coral snakes",
            "crocodiles" ,"dinosaurs", "flying lizards", "turtles" ,"geckos", "gharials", "gila monsters", "iguanas", "mambas", "monitor lizards",
            "rattle snakes", "pythons", "plastrons", "sea turtles" ,"skinks", "tortoises", "vipers"};

    String mammals[] ={"mammals", "aardvarks", "african elephants", "african wild dogs", "african lions", "arabian camel arctic fox", "arctic hares",
            "armadillos", "asian elephants", "asian lions", "aye-aye", "baboons", "bactrian camels", "beavers", "bears", "black bears",
            "beluga whales", "bengal tigers", "black-footed ferrets", "black rhinoceros", "blue whales", "bobcats", "bottlenose dolphins",
            "brown bears", "california sea lions", "caribou", "cats", "cheetahs", "chimpanzees", "chipmunks", "clouded leopards",
            "common vampire bat common wombats", "cottontail rabbits", "cougars", "coyotes", "dingos","dogs", "domestic cats", "domestic dogs",
            "dugongs", "eastern gray kangaroos", "elephants", "african elephants", "asian elephants", "seals", "elks", "fennec fox",
            "fossas", "fox", "fennecs", "fur seals", "geladas", "giant anteaters", "giant pandas", "giant river otters", "gibbons", "giraffes",
            "golden lion tamarins", "gray whales", "grizzly bears", "groundhogs", "harbor porpoises", "hares", "hare arctic", "harp seals",
            "hawaiian monk seals", "hedgehogs", "hippopotamus", "horses", "howler monkeys", "humpback whales", "humans", "impalas",
            "indian rhinoceros", "jaguars", "killer whales", "orcas", "kinkajous", "koalas", "leopards", "leopard seals", "lions",
            "little red flying fox", "llamas", "lynx", "manatees", "mandrills", "meerkats", "mongooses", "mooses", "mountain goats",
            "mountain gorillas", "mountain lions", "mouse lemurs", "musk-ox", "mole rats", "narwhals", "north american river otters", "nutrias",
            "ocelots", "opossums", "orangutans", "orca killer whales", "ozark big-eared bats", "platypus", "polar bears", "porcupines",
            "prairie dogs", "proboscis monkeys", "pronghorns", "przewalski’s horses", "raccoons", "red fox", "red kangaroos",
            "red leaf monkeys", "red pandas", "red uakaris", "rhesus monkeys", "right whales", "ringed seals", "ring-tailed lemurs",
            "rocky mountain bighorn sheeps", "sea otters", "siberian tigers", "sifakas", "skunks", "sloth bears", "snow leopards",
            "snowshoe hares", "spectacled bears", "sperm whales", "spider monkeys", "spotted hyenas", "squirrels", "steller sea lions",
            "sumatran rhinoceros", "sumatran tigers", "sun bears", "tapirs", "tasmanian devils", "thomson’s gazelles", "three-toed sloths",
            "two-toed sloths", "wallaby", "walrus", "warthogs", "water buffalo", "weddell seals", "western lowland gorillas",
            "white rhinoceros", "whales", "blue whales", "humpbacks", "white-eared kobs", "white-tailed deers", "wildebeests", "wolfs",
            "wolverines", "zebras", "pigs", "bats", "deers", "rats", "tigers"
    };

    String birds[] = {"birds", "hen harriers", "herring gulls", "honey buzzards", "hooded crows", "house martins", "house sparrows", "gadwalls", "gannets",
            "garden warblers", "garganeys","glaucous gulls","goldcrests","golden eagles","golden plovers", "goldeneyes"," goldfinch",
            "goosanders", "goshawks","grasshopper warblers"," great black-backed gulls", "great crested grebes", "great northern divers","great skuas",
            "great spotted woodpeckers", "great tits", "green sandpipers", "greenfinch", "greenland white-fronted goose", "greenshanks",
            "green-winged teals", "grey herons", "grey partridges", "grey phalaropes", "grey plovers","grey wagtails", "greylag gooses",
            "feral pigeons","fieldfares","firecrests","fulmars", "eiders","european white-fronted goose", "dippers","dunlins","dunnocks",
            "canada goose","chaffinch","chiffchaffs","choughs","coal tits","collared doves", "common gulls","common redpolls",
            "common sandpipers","common scoters", "common terns","coots","cormorants","corn buntings","corncrakes","cory's shearwaters",
            "crossbills","cuckoos","curlews","curlew sandpipers","american golden plovers","arctic terns", "shearwaters","barn owls",
            "barnacle gooses","bar-tailed godwits","bean goose","bewick's swans" ,"black brants","black guillemots","black redstarts",
            "black swans","blackbirds","blackcaps", "black-headed gulls","black-necked grebes","black-tailed godwits","black-throated divers",
            "blue tits","bramblings", "brent gooses", "buff-breasted sandpipers","bullfinch","buzzards","yellow-browed warblers",
            "yellowhammers","water rails","waxwings","wheatears","whimbrels","whinchats","white-tailed sea eagles", "whitethroats",
            "whooper swans","wigeons","willow warblers","wood sandpipers","wood warblers","woodcocks","woodpigeons","wrens", "velvet scoters",
            "teals","tree sparrows","treecreepers","tufted ducks","turnstones","turtle doves","twites", "sabine's gulls","sand martins",
            "sanderlings","sandwich terns","scaups","sedge warblers","shags","shelducks","short-eared owls","shoveler", "siskin","skylarks",
            "slavonian grebes","smews","snipes","snow buntings","snow goose","snowy owls","song thrush","sparrowhawks","spotted flycatchers","spotted redshanks",
            "starlings","stock doves","stonechats","storm petrels","surf scoters","swallows","swifts", "ravens", "razorbills", "red grouses",
            "red-breasted mergansers", "red kites", "red-legged partridges", "red-necked grebes", "redshanks", "redstarts",
            "red-throated divers", "redwings", "reed buntings", "reed warblers", "ring ouzels", "ring-billed gulls", "ringed plovers", "pigeons",
            "ring-necked ducks", "robins", "rock doves", "rock pipits", "rooks", "roseate terns", "ruddy ducks", "ruffs", "pectoral sandpipers",
            "peregrines", "pheasants", "pied flycatchers", "pied wagtails", "pink-footed goose", "pintails", "pochards", "puffins",
            "purple sandpipers", "nightjars", "oystercatchers", "magpies", "mallards", "manx shearwaters", "marsh harriers", "meadow pipits",
            "mediterranean gulls", "merlins", "mistle thrush", "moorhens", "mute swans", "lapwings", "leach's petrels",
            "lesser black-backed gulls", "lesser redpolls", "lesser whitethroats", "linnets", "little egrets", "little grebes", "little gulls",
            "little ringed plovers", "little stints", "little terns", "long-billed dowitchers", "long-eared owls", "long-tailed ducks",
            "long-tailed tits", "kestrels", "kingfishers", "kittiwakes", "knots", "iceland gulls", "jack snipes", "jackdaws", "jays"
    };

    ImageButton btnSearch;
    EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSearch = findViewById(R.id.btnSearch);
        etSearch = findViewById(R.id.etSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(etSearch.getText());
                boolean done = false;

                if(done == false){
                    for (String a : mammals) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, Mammals.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    for (String a : amphibians) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, Amphibians.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    for (String a : reptiles) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, Reptiles.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    for (String a : premammals) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, PreMammals.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    for (String a : fish) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, Fish.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    for (String a : birds) {
                        if (Arrays.asList(mammals).contains(s) || Arrays.asList(mammals).contains(s+'s')) {
                            done = true;
                            Intent i = new Intent(MainActivity.this, Birds.class);
                            startActivity(i);
                            break;
                        }
                    }
                }

                if(done == false){
                    Toast t = Toast.makeText(MainActivity.this, "Sorry !! Species not found", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
    }
}
