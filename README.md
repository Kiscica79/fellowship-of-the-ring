# Fellowship of the Ring

A Gyűrű szövetsége különböző népekből áll össze: törpök, tündék, emberek, hobbitok és varázslók.

### Törpök
Készíts egy `dwarves` nevű `Set`-et, ami `String`-eket tárol és add hozzá **Gimli**t!

<details><summary>Megoldás</summary><pre>
`Set<String> dwarves = new HashSet<>();`
`dwarves.add("Gimli");`
</pre></details>

### Tündék
Készíts egy `elves` nevű `Set`-et, ami `String`-eket tárol és add hozzá **Legolas**t!

### Emberek
Készíts egy `humans` nevű `Set`-et, ami `String`-eket tárol és add hozzá **Aragorn**t és **Boromir**t!

### Hobbitok
Készíts egy `hobbits` nevű `Set`-et, ami `String`-eket tárol és add hozzá **Frodó**t, Samut (**Sam**), 
Trufát (**Merry**), és **Pippin**t!

Több elemet egyszerűbben is bele tudunk rakni egy Setbe így:

`Set<String> hobbits = new HashSet<>(Arrays.asList("Frodo", "Sam", "Merry", "Pippin"));`

vagy így:

`Set<String> hobbits = new HashSet<>(List.of("Frodo", "Sam", "Merry", "Pippin"));`

Írd át, hogy minden Set-hez ebben a formátumban add hozzá a tagokat, ne használj sehol `.add()`-ot!

### Mordorba nem szokás csak úgy besétálni
Alakítsuk most meg a szövetséget!
Készíts egy Stringeket tartalmazó Set-et `fellowship` néven!

Add hozzá a népeket, használd az `addAll()` metódust!
Ellenőrzésképp írasd ki a szövetség tagjait!

Ki maradt ki? :)
Add hozzá a `fellowship`-hez a kimaradó **Gandalf**ot!

### Itt úgyse jössz át!
A Balrog magával rántotta Gandalfot, távolítsd el a szövetségből!
Később Szürke Gandalf visszatér Fehér Gandalfként: add hozzá a szövetséghez
**Gandalf the White**-ot!

### És mi lesz a második reggelivel?
A hobbitok nem kaptak második reggelit, ezért úgy döntöttek, ideiglenesen kilépnek a szövetségből,
amíg nem találnak valahol kolompért (bur-go-nya) vagy lembas kenyeret.
Távolítsd el a hobbitokat a szövetségből!
Ellenőrizd, hogy tényleg nem tagjai már a szövetségnek a `containsAll()` metódussal!

### A fehér kéz jele
Ellenőrizd, hogy az Uruk-hai támadás után a szövetség tagja-e még Boromir! 
