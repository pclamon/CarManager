INSERT INTO Make (MakeId, MakeName)
          VALUES (1,     'Chevrolet'),
                 (2,     'Cadillac'),
                 (3,     'Pontiac'),
                 (4,     'Infiniti'),
                 (5,     'Lexus'),
                 (6,     'Toyota'),
                 (7,     'Ford'),
                 (8,     'Mazda'),
                 (9,     'Nissan'),
                 (10,    'Subaru'),
                 (11,    'Suzuki');

INSERT INTO Model (ModelId, ModelName, MakeId)
           VALUES (1,      'Corvette', 1),
                  (2,      'CTS',      2),
                  (3,      'GTO',      3),
                  (4,      'M',        4),
                  (5,      'Q',        4),
                  (6,      'LS',       5),
                  (7,      'SC',       5),
                  (8,      'Corolla',  6),
                  (9,      'Previa',   6),
                  (10,     'Supra',    6),
                  (11,     'Prius',    6),
                  (12,     'E',        7),
                  (13,     'Bronco',   7),
                  (14,     'Miata',    8),
                  (15,     'RX-7',     8),
                  (16,     '240SX',    9),
                  (17,     'Baja',     10),
                  (18,     'Impreza',  10),
                  (19,     'GSXR',     11);

INSERT INTO Submodel (SubmodelId, SubmodelName, ModelId)
              VALUES (1,         'Z06',         1),
                     (2,         'V',           2),
                     (3,         '35',          4),
                     (4,         '45',          4),
                     (5,         '45',          5),
                     (6,         '50',          5),
                     (7,         '60',          5),
                     (8,         '70',          5),
                     (9,         '70L',         5),
                     (10,        '400',         6),
                     (11,        '430',         6),
                     (12,        '460',         6),
                     (13,        '460 L',       6),
                     (14,        '500',         6),
                     (15,        '600h L',      6),
                     (16,        '300',         7),
                     (17,        '400',         7),
                     (18,        '430',         7),
                     (19,        'GTS',         8),
                     (20,        'LE',          9),
                     (21,        'LE S/C',      9),
                     (22,        'Turbo',       10),
                     (23,        '150',         12),
                     (24,        '250',         12),
                     (25,        '350',         12),
                     (26,        'M Edition',   14),
                     (27,        'Mazdaspeed',  14),
                     (28,        'GS',          15),
                     (29,        'LS',          15),
                     (30,        'GSL',         15),
                     (31,        'GSL-SE',      15),
                     (32,        'Sport',       15),
                     (33,        'GXL',         15),
                     (34,        'GTU',         15),
                     (35,        'Convertible', 15),
                     (36,        'Turbo II',    15),
                     (37,        'GTUs',        15),
                     (38,        'XE',          16),
                     (39,        'LE',          16),
                     (40,        'SE',          16),
                     (41,        'Convertible', 16),
                     (42,        'Turbo',       17),
                     (43,        'WRX',         18),
                     (44,        'WRX STi',     18);

INSERT INTO Vehicle (VehicleId, VehicleYear, Nickname,     ModelId, SubmodelId, TradedForVehicleId)
             VALUES (1,         2004,       'Drift Vette', 1,       1,          NULL),
                    (2,         2004,       '\'Llac',      2,       2,          1),
                    (3,         2005,        NULL,         3,       NULL,       2),
                    (4,         2003,        NULL,         4,       4,          3),
                    (5,         1990,        NULL,         16,      NULL,       NULL),
                    (6,         1997,        NULL,         14,      26,         5),
                    (7,         1996,       '4.8T',        16,      NULL,       NULL),
                    (8,         2006,        NULL,         19,      NULL,         7),
                    (9,         1991,        NULL,         15,      35,         8),
                    (10,        1996,        NULL,         6,       10,         NULL),
                    (11,        1995,        NULL,         7,       16,         10),
                    (12,        1986,       'AE86',        8,       19,         11),
                    (13,        1996,        NULL,         9,       21,         NULL),
                    (14,        2004,        NULL,         17,      NULL,       13),
                    (15,        1991,       'Turbo Miata', 14,      NULL,       14),
                    (16,        2001,        NULL,         5,       5,          15);