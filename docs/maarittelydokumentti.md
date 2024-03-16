# Määrittelydokumentti

Tämä on määrittelydokumentti tietojenkäsittelytieteen kandiohjelman kurssilla TKT20010 keväällä 2024 periodissa IV toteutettavaan harjoitustyöhön.

Työn aiheena on kirjoitusvirheiden korjaaja, jolla voidaan selvittää oikea sana annetulle syötteelle mikäli annettu syöte ei ole "oikea sana". Toteutuksessa hyödynnetään merkkijonojen etäisyysmittoja soveltaen [Damerau–Levenshtein](https://en.wikipedia.org/wiki/Damerau%E2%80%93Levenshtein_distance) -etäisyyttä. Vaatimusten mukaisesti sanasto tallennetaan itse toteutettuun [trie-tietorakenteeseen](https://en.wikipedia.org/wiki/Trie). Tarvittaessa harjoitustyössä voidaan hyödyntää myös muita julkisia lähteitä, jotka dokumentoidaan myöhemmin.

Harjoitus työ olisi tarkoitus toteuttaa Java-kielellä tai mahdollisuuksien mukaan C#-kielellä riippuen mahdollisuudesta C#-kielen hyödyntämiseen.

Muiden harjoitustöiden vertaisarviointeihin soveltuvat kielet ovat edellä mainittujen Javan ja C#:n ohella mm. Pythonista sekä JavaScriptista.

## Dokumentaatio

Ohjelmakoodi kirjoitetaan englanniksi mutta koodin dokumentaatio toteutetaan suomeksi kuten myös muu dokumentaatio.