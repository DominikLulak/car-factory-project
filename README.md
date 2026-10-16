# Konfigurátor vozidel (Car Factory)

Projekt je vytvářen v rámci předmětu **KNAV** na **Univerzitě Pardubice**

* **Autor:** Dominik Lulák
* **Jazyk** Java
* **Architektura** Konzolová aplikace (CLI)

---

## Přehled cvičení a návrhových vzorů

### Cvičení 1: Creational Patterns

V rámci prvího cvičení byla implementována logika pro konfiguraci a sestavení vozidla s využitím dvo vytvářejících návrhových vzorů:

1. **Abstract Factory (`CarPartsFactory`)**
   * **Účel:** Zajišťuje vytváření ucelených rodin kompatibilních dílů pro vybranou řadu vozidla (např. sportovní vs. off-road).
   * **Implementace:** Rozhraní `CarPartsFactory` s metodami `createEngine()` a `createSuspension()`. Konkrétní továrny (`SportsCarFactory`, `OffRoadCarFacotry`) vracejí odpovídající typy motorů a podvozků, aby nedocházelo k míchání nekomatibilních dílů.

2. **Builder (`CarBuilder`)**
    * **Účel:** Umožňuje postupné a přehledné sestavování objektu `Car` z vybraných komponent a doplňkových parametrů.
    * **Implementace** Třída `CarBuilder` využívá řetězení metod (fluent interface) pro nastavení vlastností (název, motor, podvozek, barva, GPS). Po dokončení konfigurace metoda `build()` vytvoří a vrátí finální objekt `Car`.

---

## Budoucí cvičení

*Bude doplňováno v průběhu semestru...*