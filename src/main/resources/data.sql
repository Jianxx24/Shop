INSERT INTO klient (klient_id,imie,nazwisko,adres,miasto,nr_karta_kredytowa, username, password) VALUES
(0,'adam', 'kowalski','ul 3 maja 11/2', 'lublin', '1234567890124567', 'adam123', '123'),
(1,'michalina', 'jakas','ul 7 maja 11/2', 'warszawa', '1234567890124567', 'michalina123', '123'),
(2,'Michał', 'Wiśniewski','ul Ognista 11/2', 'warszawa', '1234567890124567', 'wisnia123', '123'),
(3,'Krzysztof', 'Krawczyk','ul Tango 11/2', 'warszawa', '1234567890124567', 'krzychu123', '123'),
(4,'Paweł', 'Podaj','ul Pasztet 11/2', 'warszawa', '1234567890124567', 'pablo123', '123'),
(5,'Łukasz', 'Dziób','ul Ptasia 11/2', 'warszawa', '1234567890124567', 'ptaku123', '123');

INSERT INTO koszyk(koszyk_id, ukonczone, klient_id) VALUES
(0, false, 0);


INSERT INTO koszyk(koszyk_id, ukonczone, klient_id) VALUES
(1, false, 1);




INSERT INTO dysk(dysk_id,obrazek, producent, nazwa, pojemnosc, typ, cache, wspolczynnik_ksztaltu, interfejs, cena) VALUES
(0, '/images/dyski/dysk0.jpg', 'Seagate', 'Barracuda Compute 2', 2048, '7200', 256, '3.5', 'SATA6', 250.0),
(1, '/images/dyski/dysk1.jpg', 'Samsung', 'Evo 970', 512 , 'SSD' , 512, 'M.2-2280' , 'M.2'  , 600.0),
(2, '/images/dyski/dysk2.jpg', 'Western Digital', 'Blue', 500 , 'SSD' , 512, 'M.2-2280' , 'M.2'  , 329.0),
(3, '/images/dyski/dysk3.jpg', 'Crucial', 'MX500', 1000 , 'SSD' , 1024, '2.5' , 'SATA6'  , 499.0),
(4, '/images/dyski/dysk4.jpg', 'Seagate', 'IronWolf Pro', 16384 , '7000' , 256, '3.5' , 'SATA6'  , 2499.0),
(5, '/images/dyski/dysk5.jpg', 'Samsung', '860 QVO', 1024 , 'SSD' , 512, '2.5' , 'SATA6'  , 449.0),
(6, '/images/dyski/dysk6.jpg', 'HP', '2 TB', 2048 , 'SSD' , 512, '2.5' , 'SATA6'  , 1799.0),
(7, '/images/dyski/dysk7.jpg', 'Western Digital', 'Black', 4096 , '7200' , 256, '3.5' , 'SATA6', 899.0),
(8, '/images/dyski/dysk8.jpg', 'Crucial', 'P2', 500 , 'SSD' , 512, 'M.2-2280' , 'M.2'  , 349.0),
(9, '/images/dyski/dysk9.jpg', 'PNY', 'CS900', 120 , 'SSD' , 512, '2.5' , 'SATA6'  , 109.0);

INSERT INTO karta_graficzna(karta_graficzna_id, obrazek, producent, nazwa, rozmiar_pamieci, typ_pamieci, taktowanie_procesora, taktowanie_pamieci, interfejs, dlugosc, tdp, zasilanie_zewnetrzne, cena) VALUES
(0, '/images/karty_graficzne/karta0.jpg', 'Gigabyte', 'GeForce RTX 2070 SUPER', 8196, 'GDDR6', 1605, 14000, 'PCIe x16', 280.35, 215, '1 PCIe 8-pin + 1 PCIe 6-pin' , 2299.0),
(1, '/images/karty_graficzne/karta1.jpg', 'Nvidia', 'GeForce RTX 2060 SUPER', 8196, 'GDDR6', 1470, 14000, 'PCIe x16', 228.6, 175, '1 PCIe 8-pin' , 1899.0),
(2, '/images/karty_graficzne/karta2.jpg', 'MSI', 'GeForce GTX 1660 SUPER', 6144, 'GDDR6', 1530, 14000, 'PCIe x16', 203.962, 125, '1 PCIe 8-pin' , 1249.0),
(3, '/images/karty_graficzne/karta3.jpg', 'Asus', 'GeForce RTX 2080 Ti', 11264, 'GDDR6', 1350, 14000, 'PCIe x16', 304.7, 250, '2 PCIe 8-pin' , 6499.0),
(4, '/images/karty_graficzne/karta4.jpg', 'Gigabyte', 'Radeon RX 5700 XT', 8196, 'GDDR6', 1650, 14000, 'PCIe x16', 279.85, 225, '1 PCIe 8-pin + 1 PCIe 6-pin' , 1799.0),
(5, '/images/karty_graficzne/karta5.jpg', 'EVGA', 'GeForce RTX 2060', 6144, 'GDDR6', 1365, 14000, 'PCIe x16', 202.1, 160, '1 PCIe 8-pin' , 1949.0),
(6, '/images/karty_graficzne/karta6.jpg', 'MSI', 'GeForce GTX 1660 Ti', 6144, 'GDDR6', 1500, 12000, 'PCIe x16', 247, 120, '1 PCIe 8-pin' , 1349.0),
(7, '/images/karty_graficzne/karta7.jpg', 'EVGA', 'GeForce RTX 2080 SUPER', 8196, 'GDDR6', 1650, 15500, 'PCIe x16', 269.83, 250, '1 PCIe 8-pin + 1 PCIe 6-pin' , 3799.0),
(8, '/images/karty_graficzne/karta8.jpg', 'Asus', 'GeForce RTX 2080 SUPER', 8196, 'GDDR6', 1650, 15500, 'PCIe x16', 299.7, 250, '2 PCIe 8-pin' , 3899.0),
(9, '/images/karty_graficzne/karta9.jpg', 'Gigabyte', 'GeForce RTX 2080 Ti', 11264, 'GDDR6', 1350, 15500, 'PCIe x16', 290, 250, '2 PCIe 8-pin' , 6399.0);


INSERT INTO naped_optyczny(naped_optyczny_id, obrazek, producent, nazwa, interfejs, typ_ksztaltu, cache, szybkosc, cena) VALUES
(0, '/images/napedy_optyczne/naped0.jpg', 'Asus', 'DRW-24B1ST', 'SATA3', 5.25, 2, 48, 200.0),
(1, '/images/napedy_optyczne/naped1.jpg', 'LG', 'WH14NS40', 'SATA1.5', 5.25, 4, 48, 299.0),
(2, '/images/napedy_optyczne/naped2.jpg', 'Pioneer', 'BDR-209DBK', 'SATA3', 5.25, 4, 40, 339.0),
(3, '/images/napedy_optyczne/naped3.jpg', 'Lite-On', 'iHAS124-14', 'SATA3', 5.25, 2, 48, 79.0),
(4, '/images/napedy_optyczne/naped4.jpg', 'Samsung', 'SH-224DB/BEBE', 'SATA3', 5.25, 2, 48, 49.0),
(5, '/images/napedy_optyczne/naped5.jpg', 'Asus', 'BW-12B1ST/BLK/G/AS', 'SATA3', 5.25, 8, 48, 399.0),
(6, '/images/napedy_optyczne/naped6.jpg', 'Panasonic', 'UJ-265', 'SATA6', 5.25, 2, 24, 109.0),
(7, '/images/napedy_optyczne/naped7.jpg', 'Sony', 'DDU1681S-0B', 'SATA3', 5.25, 2, 48, 69.0),
(8, '/images/napedy_optyczne/naped8.jpg', 'Lite-On', 'iHES112-29', 'SATA3', 5.25, 2, 48, 269.0),
(9, '/images/napedy_optyczne/naped9.jpg', 'Asus', 'DRW-24D3ST', 'SATA6', 5.25, 2, 48, 200.0);

INSERT INTO obudowa(obudowa_id, obrazek, producent, nazwa, kolor, typ_ksztaltu, max_dlugosc_grafiki, sloty_25, sloty_35, cena) VALUES
(0, '/images/obudowy/obudowa0.jpg', 'NZXT', 'H510', 'CZARNY', 'ATX Mid Tower', 381.0, 2, 2, 400.0),
(1, '/images/obudowy/obudowa1.jpg', 'Fractal Design', 'Meshify C', 'CZARNY', 'ATX Mid Tower', 315.0, 3, 2, 449.0),
(2, '/images/obudowy/obudowa2.jpg', 'Corsair', 'SPEC-DELTA RGB', 'CZARNY', 'ATX Mid Tower', 330.0, 2, 2, 349.0),
(3, '/images/obudowy/obudowa3.jpg', 'Cougar', 'MX330', 'CZARNY', 'ATX Mid Tower', 350.0, 2, 2, 279.0),
(4, '/images/obudowy/obudowa4.jpg', 'Phanteks', 'Eclipse P300A Mesh', 'CZARNY', 'ATX Mid Tower', 355.0, 1, 2, 289.0),
(5, '/images/obudowy/obudowa5.jpg', 'Thermaltake', 'Versa H17', 'CZARNY', 'MicroATX Mini Tower', 350.0, 2, 2, 199.0),
(6, '/images/obudowy/obudowa6.jpg', 'Fractal Design', 'Focus G', 'BIAŁY', 'ATX Mid Tower', 380.0, 1, 2, 229.0),
(7, '/images/obudowy/obudowa7.jpg', 'Lian Li', 'PC-O11 Dynamic', 'BIAŁY', 'ATX Full Tower', 420.0, 4, 2, 699.0),
(8, '/images/obudowy/obudowa8.jpg', 'Cooler Master', 'MasterBox MB511 RGB', 'CZARNY', 'ATX Mid Tower', 410.0, 6, 2, 319.0),
(9, '/images/obudowy/obudowa9.jpg', 'Cooler Master', 'MasterCase H500P Mesh', 'BIAŁY', 'ATX Mid Tower', 412.0, 2, 2, 649.0);

INSERT INTO plyta_glowna(plyta_glowna_id, obrazek, producent, nazwa, socket, typ_ksztaltu, chipset, typ_pamieci, sloty_pamieci, max_obslugiwana_ilosc_pamieci, obslugiwane_szybkosci_pamieci,sloty_pcie_x16, sloty_pcie_x8, sloty_pcie_x4, sloty_pcie_x1, sloty_msata, sloty_sata, sloty_m2, sloty_usb2, sloty_usb3, cena) VALUES
VALUES (0, '/images/plyty_glowne/plyta0.jpg', 'ASRock', 'B450M PRO4', 'AM4', 'Micro ATX', 'AMD B450', 'DDR4', 4, 64, '2133,2400,2666,2933,3200', 2,0,0,1, 0, 4, 2, 2, 0, 629),
(1, '/images/plyty_glowne/plyta1.jpg', 'MSI', 'MPG X570 GAMING PLUS', 'AM4', 'ATX', 'AMD X570', 'DDR4', 4, 128, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 2,0,0,3, 0, 6, 2, 2, 2, 799),
(2, '/images/plyty_glowne/plyta2.jpg', 'Asus', 'ROG Strix X570-E Gaming', 'AM4', 'ATX', 'AMD X570', 'DDR4', 4, 128, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 3,0,0,2, 0, 8, 2, 2, 2, 1449),
(3, '/images/plyty_glowne/plyta3.jpg', 'MSI', 'Z390-A PRO', 'LGA1151', 'ATX', 'Intel Z390', 'DDR4', 4, 128, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 2,0,0,4, 0, 6, 2, 2, 2, 599),
(4, '/images/plyty_glowne/plyta4.jpg', 'Asus', 'ROG Rampage VI Extreme Encore', 'LGA2066', 'EATX', 'Intel X299', 'DDR4', 8, 256, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 3,0,1,0, 0, 8, 2, 1, 2, 3249),
(5, '/images/plyty_glowne/plyta5.jpg', 'Asus', 'ROG ZENITH II EXTREME ALPHA', 'sTRX4', 'EATX', 'AMD TRX40', 'DDR4', 8, 256, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 4,0,0,0, 0, 8, 5, 2, 4, 3499),
(6, '/images/plyty_glowne/plyta6.jpg', 'Asus', 'ROG STRIX Z490-E GAMING', 'LGA1200', 'ATX', 'Intel Z490', 'DDR4', 4, 128, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 3,0,0,3, 0, 6, 2, 2, 2, 1449),
(7, '/images/plyty_glowne/plyta7.jpg', 'MSI', 'B450 TOMAHAWK MAX', 'AM4', 'ATX', 'AMD B450', 'DDR4', 4, 64, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 2,0,0,3, 0, 6, 1, 2, 1, 499),
(8, '/images/plyty_glowne/plyta8.jpg', 'Asus', 'PRIME X570-P', 'AM4', 'ATX', 'AMD X570', 'DDR4', 4, 128, '1866,2133,2400,2666,2800,2933,3000,3200,3466,3600,3733', 2,0,0,3, 0, 6, 2, 2, 2, 799),
(9, '/images/plyty_glowne/plyta9.jpg', 'ASRock', 'B365 Pro4', 'LGA1151', 'ATX', 'Intel B365', 'DDR4', 4, 64, '2133,2400,2666', 2,0,0,2, 0, 6, 3, 2, 1, 399);


INSERT INTO procesor(procesor_id, obrazek, producent, nazwa, socket, ilosc_rdzeni, taktowanie, tdp, maks_pamiec, l1, l2, l3, technologia, cena) VALUES
(0,'/images/procesory/procesor0.jpg', 'AMD', 'Ryzen 5 3600', 'AM4', 6, 3.6, 65, 128, '6x 32kB I, 6x 64kB D', '6x 512kB', '2x 16MB', '7nm', 729.00),
(1,'/images/procesory/procesor1.jpg','AMD','Ryzen 9 3900X','AM4',12,3.8,105,128,'12x32 kB I, 12x64 kB D','12 x 512 kB','4 x 16 MB','7nm',2099),
(2,'/images/procesory/procesor2.jpg','AMD','ThreadRipper 3990X','sTRX4',64,2.9,280,1024,'64x32 kB I, 64x32 kB D','64 x 512 kB','16 x 16 MB','7nm',18099),
(3,'/images/procesory/procesor3.jpg','Intel','Core i7-9700K','LGA1151',8,3.6,95,128,'8x32 kB I, 8x32 kB D','8 x 256 kB','8 x 1.5 MB','14nm',1699),
(4,'/images/procesory/procesor4.jpg','Intel','Core i9-10900K','LGA1200',10,3.7,125,128,'10x32 kB I, 10x32 kB D','10 x 256 kB','1 x 20 MB','14nm',1699),
(5,'/images/procesory/procesor5.jpg','AMD','Ryzen 3 3300X','AM4',4,3.8,65,128,'4x32 kB I, 4x64 kB D','4 x 512 kB','1 x 16 MB','7nm',549),
(6,'/images/procesory/procesor6.jpg','Intel','Core i9-10980XE','LGA2066',18,3,165,256,'18x32 kB I, 18x32 kB D','18 x 1 MB','1 x 24.75 MB','14nm',5149),
(7,'/images/procesory/procesor7.jpg','AMD','Ryzen 7 2700','AM4',8,3.2,65,64,'8x64 kB I, 8x32 kB D','8 x 512 kB','1 x 16 MB','12nm',549),
(8,'/images/procesory/procesor8.jpg','Intel','Core i9-9900K','LGA1151',8,3.6,95,128,'8x32 kB I, 8x32 kB D','8 x 256 kB','1 x 16 MB','14nm',2399),
(9,'/images/procesory/procesor9.jpg','AMD','Ryzen 7 1700','AM4',8,3,65,64,'8x64 kB I, 8x32 kB D','8 x 512 kB','2 x 8 MB','14nm',699);


INSERT INTO ram(ram_id, obrazek, producent, nazwa, rozmiar_pamieci, taktowanie, typ_pamieci, cas, napiecie, timingi, cena)
VALUES (0, '/images/ran/ram0.jpg',  'Corsair', 'Vengeance LPX', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-36', 250.0),
 (1, '/images/ran/ram1.jpg',  'G.Skill', 'Ripjaws V', 16, 3600, 'DDR4', 16, 1.35, '16-19-19-39', 349.0),
 (2, '/images/ran/ram2.jpg',  'Crucial', 'Ballistix', 8, 2400, 'DDR4', 16, 1.35, '16-16-16-39', 179.0),
 (3, '/images/ran/ram3.jpg',  'G.Skill', 'Aegis', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-38', 339.0),
 (4, '/images/ran/ram4.jpg',  'G.Skill', 'Trident Z RGB', 32, 3600, 'DDR4', 16, 1.35, '16-19-19-39', 1099.0),
 (5, '/images/ran/ram5.jpg',  'Corsair', 'Vengeance LPX', 16, 3000, 'DDR4', 16, 1.35, '16-20-20-38', 349.0),
 (6, '/images/ran/ram6.jpg',  'Kingston', 'HyperX Fury', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-36', 349.0),
 (7, '/images/ran/ram7.jpg',  'Kingston', 'HyperX Fury RGB', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-36', 399.0),
 (8, '/images/ran/ram8.jpg',  'Kingston', 'HpyerX Predator RGB', 16, 3200, 'DDR4', 16, 1.35, '16-18-18-36', 459.0),
 (9, '/images/ran/ram9.jpg',  'Crucial', 'Ballistix', 16, 2400, 'DDR4', 16, 1.35, '16-16-16-39', 439.0);

INSERT INTO zasilacz(zasilacz_id,obrazek, producent, nazwa, typ_ksztaltu, moc, eps, pcie_plus, sata, molex, cena) VALUES
(0, '/images/zasilacze/zasilacz0.jpg', 'Corsair', 'RM2019', 'ATX', 750, 2, 6, 10, 4, 500.0),
(1, '/images/zasilacze/zasilacz1.jpg', 'Cooler Master', 'MWE Gold 650', 'ATX', 650, 1, 4, 8, 6, 459.0),
(2, '/images/zasilacze/zasilacz2.jpg', 'EVGA', 'BQ 600', 'ATX', 600, 1, 2, 6, 3, 309.0),
(3, '/images/zasilacze/zasilacz3.jpg', 'Corsair', 'AX', 'ATX', 1000, 2, 8, 16, 8, 1549.0),
(4, '/images/zasilacze/zasilacz4.jpg', 'Asus', 'ROG Thor 1200P', 'ATX', 1200, 2, 8, 12, 5, 1599.0),
(5, '/images/zasilacze/zasilacz5.jpg', 'EVGA', 'SuperNOVA 850', 'ATX', 850, 2, 4, 9, 6, 799.0),
(6, '/images/zasilacze/zasilacz6.jpg', 'SeaSonic', 'EVO Edition 620', 'ATX', 620, 1, 4, 8, 5, 419.0),
(7, '/images/zasilacze/zasilacz7.jpg', 'Thermaltake', 'Toughpower Grand RGB 650', 'ATX', 650, 1, 4, 9, 4, 499.0),
(8, '/images/zasilacze/zasilacz8.jpg', 'be quiet!', 'Straight Power 11', 'ATX', 650, 1, 2, 9, 3, 559.0),
(9, '/images/zasilacze/zasilacz9.jpg', 'NZXT', 'C 750', 'ATX', 750, 1, 4, 8, 6, 699.0);



INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id, cena) VALUES
(0, false,0, null, 0,0,0,0,0,0,0,0);

INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,0),
        (0,0);

INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id, cena) VALUES
(1, false,1, null, 0,0,0,0,0,0,0,0);


INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,1),
        (1,1),
        (2,1),
        (3,1);
INSERT INTO komputer(komputer_id, zlozone, klient_id, koszyk_id, plyta_glowna_id, procesor_id, zasilacz_id,  dysk_id, karta_graficzna_id, naped_optyczny_id, obudowa_id, cena) VALUES
(2, true,1, 1, 0,0,0,0,0,0,0,0);


INSERT INTO komputer_ram(ram_id, komputer_id)
VALUES (0,2),
        (0,2),
        (0,2);






