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

### Cvičení 2: Structural Patterns

V rámci druhého cvičení byla aplikována rozšíření a integrace pomocí dvou strukturálních návrhových vzorů:

1. **Decorator (`CarDecorator`)**
   * **Účel:** Umožňuje dynamické přidávání příplatkové výbavy k existujícímu vozidlu (např. prémiová audia) bez nutnosti měnit základní třídu `Car` nebo vytváŕet složitou hirearchii podtříd.
   * **Implementace:** Společné rozhraní `CarComponent` implementované jak samotným vozidlem (`Car`), tak abstraktním dekorátorem (`CarDecorator`). Konkrétní dekorátory (`PremiumAudioDecorator`, `SportSpoilerDecorator`) obalují komponentu, rozšiřují popis a navyšují celkovou cenu.
   
2. **Adapter (`RegistryAdapter`)**
   * **Účel:** Slouží k propojení moderního objektového modelu aplikace (`Car`) se starším, neměnným externím systémem pro registraci vozidel (`OldRegistrySystem`).
   * **Implementace:** Rozhraní `RegistryTarget` definuje jednotné očekávané chování. Třída `RegistryAdapter` přebírá volání z aplikace, adaptuje data z objektu `Car` na formát požadovaný starým systémem a předává je k registraci.

## Budoucí cvičení

*Bude doplňováno v průběhu semestru...*