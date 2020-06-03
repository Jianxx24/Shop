INSERT INTO klient (klient_id,imie,nazwisko,adres,miasto,nr_karta_kredytowa, username, password) VALUES
 (0,'adam', 'kowalski','ul 3 maja 11/2', 'lublin', '1234567890124567', 'adam123', '123');

INSERT INTO koszyk(koszyk_id, ukonczone, klient_id) VALUES
(0, false, 0);

INSERT INTO klient (klient_id,imie,nazwisko,adres,miasto,nr_karta_kredytowa, username, password) VALUES
 (1,'michalina', 'jakas','ul 7 maja 11/2', 'warszawa', '1234567890124567', 'michalina123', '123');

INSERT INTO koszyk(koszyk_id, ukonczone, klient_id) VALUES
(1, false, 1);




INSERT INTO dysk(dysk_id,obrazek, producent, nazwa, pojemnosc, typ, cache, wspolczynnik_ksztaltu, interfejs, cena)
VALUES (0, '/images/dyski/dysk0.jpg', 'Seagate', 'Barracuda Compute 2', 2048, '7200', 256, '3.5'      , 'SATA6', 250.0),
       (1, '/images/dyski/dysk1.jpg', 'Samsung', 'Evo 970'            , 512 , 'SSD' , 512, 'M.2-2280' , 'M.2'  , 600.0);

INSERT INTO karta_graficzna(karta_graficzna_id, obrazek, producent, nazwa, rozmiar_pamieci, typ_pamieci, taktowanie_procesora, taktowanie_pamieci, interfejs, dlugosc, tdp, zasilanie_zewnetrzne, cena)
VALUES (0, '/images/karty_graficzne/karta0.jpg', 'Gigabyte', 'GeForce RTX 2070 SUPER', 8196, 'GDDR6', 1605, 14000, 'PCIe x16', 280.35, 215, '1 PCIe 8-pin + 1 PCIe 6-pin' , 2299.99);


INSERT INTO naped_optyczny(naped_optyczny_id, obrazek, producent, nazwa, interfejs, typ_ksztaltu, cache, szybkosc, cena)
VALUES (0, '/images/napedy_optyczne/naped0.jpg', 'Asus', 'DRW-24B1ST', 'SATA3', 5.25, 2, 48, 200.0);

INSERT INTO obudowa(obudowa_id, obrazek, producent, nazwa, kolor, typ_ksztaltu, max_dlugosc_grafiki, sloty_25, sloty_35, cena)
VALUES (0, '/images/obudowy/obudowa0.jpg', 'NZXT', 'H510', 'CZARNY', 'ATX Mid Tower', 381.0, 2, 2, 400.0);

INSERT INTO plyta_glowna(plyta_glowna_id, obrazek, producent, nazwa, socket, typ_ksztaltu, chipset, typ_pamieci, sloty_pamieci, max_obslugiwana_ilosc_pamieci, obslugiwane_szybkosci_pamieci,sloty_pcie_x16, sloty_pcie_x8, sloty_pcie_x4, sloty_pcie_x1, sloty_msata, sloty_sata, sloty_m2, sloty_usb2, sloty_usb3, cena)
VALUES (0, '/images/plyty_glowne/plyta0.jpg', 'ASRock', 'B450M PRO4', 'AM4', 'Micro ATX', 'AMD B450', 'DDR4', 4, 64, '2133,2400,2666,2933,3200', 2,0,0,1, 0, 4, 2242, 2, 0, 629.99);


INSERT INTO procesor(procesor_id, obrazek, producent, nazwa, socket, ilosc_rdzeni, taktowanie, tdp, maks_pamiec, l1, l2, l3, technologia, cena)
VALUES (0, '/images/procesory/procesor0.jpg', 'AMD', 'Ryzen 5 3600', 'AM4', 6, 3.6, 65, 128, '6x 32kB I, 6x 64kB D', '6x 512kB', '2x 16MB', '7nm', 729.00);


INSERT INTO ram(ram_id, obrazek, producent, nazwa, rozmiar_pamieci, taktowanie, typ_pamieci, cas, napiecie, timingi, cena)
VALUES (0, '/images/ran/ram0.jpg',  'Corsair', 'Vengeance LPX', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-36', 250.0);

INSERT INTO zasilacz(zasilacz_id,obrazek, producent, nazwa, typ_ksztaltu, moc, eps, pcie_plus, sata, molex, cena)
VALUES (0, '/images/zasilacze/zasilacz0.jpg', 'Corsair', 'RM2019', 'ATX', 750, 2, 6, 10, 4, 500.0);



INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id ) VALUES
(0, false,0, null, 0,0,0,0,0,0,0);

INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,0),
        (0,0);

INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id ) VALUES
(1, true,1, 1, 0,0,0,0,0,0,0);


INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,1),
        (0,1);

INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id ) VALUES
(2, true,1, 1, 0,0,0,0,0,0,0);


INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,2),
        (0,2),
        (0,2);






