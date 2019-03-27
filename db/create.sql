
CREATE TABLE Make (
                MakeId INT AUTO_INCREMENT NOT NULL,
                MakeName VARCHAR(30) NOT NULL,
                PRIMARY KEY (MakeId)
);


CREATE TABLE Model (
                ModelId INT AUTO_INCREMENT NOT NULL,
                ModelName VARCHAR(30) NOT NULL,
                MakeId INT NOT NULL,
                PRIMARY KEY (ModelId)
);


CREATE TABLE Submodel (
                SubmodelId INT NOT NULL,
                SubmodelName VARCHAR(30),
                ModelId INT NOT NULL,
                PRIMARY KEY (SubmodelId)
);


CREATE TABLE Vehicle (
                VehicleId INT AUTO_INCREMENT NOT NULL,
                VIN VARCHAR(17),
                VehicleYear DECIMAL(4) NOT NULL,
                Nickname VARCHAR(30),
                ModelId INT NOT NULL,
                SubmodelId INT,
                TradedForVehicleId INT,
                PRIMARY KEY (VehicleId)
);


CREATE TABLE Cost (
                CostId INT NOT NULL,
                VehicleId INT NOT NULL,
                CostName VARCHAR(30) NOT NULL,
                CostDate DATETIME NOT NULL,
                CostMileage DECIMAL(8) NOT NULL,
                PRIMARY KEY (CostId)
);


CREATE TABLE CostDetail (
                CostDetailId INT NOT NULL,
                CostId INT NOT NULL,
                Price DECIMAL(10,2) NOT NULL,
                Notes VARCHAR(250),
                PRIMARY KEY (CostDetailId)
);


CREATE TABLE VehiclePicture (
                VehiclePictureId INT AUTO_INCREMENT NOT NULL,
                Picture LONGBLOB NOT NULL,
                VehicleId INT NOT NULL,
                PRIMARY KEY (VehiclePictureId)
);


ALTER TABLE Model ADD CONSTRAINT make_model_fk
FOREIGN KEY (MakeId)
REFERENCES Make (MakeId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Vehicle ADD CONSTRAINT model_vehicle_fk
FOREIGN KEY (ModelId)
REFERENCES Model (ModelId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Submodel ADD CONSTRAINT model_submodel_fk
FOREIGN KEY (ModelId)
REFERENCES Model (ModelId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Vehicle ADD CONSTRAINT submodel_vehicle_fk
FOREIGN KEY (SubmodelId)
REFERENCES Submodel (SubmodelId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE VehiclePicture ADD CONSTRAINT vehicle_vehiclepicture_fk
FOREIGN KEY (VehicleId)
REFERENCES Vehicle (VehicleId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Vehicle ADD CONSTRAINT vehicle_vehicle_fk
FOREIGN KEY (TradedForVehicleId)
REFERENCES Vehicle (VehicleId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE Cost ADD CONSTRAINT vehicle_cost_fk
FOREIGN KEY (VehicleId)
REFERENCES Vehicle (VehicleId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE CostDetail ADD CONSTRAINT cost_costdetail_fk
FOREIGN KEY (CostId)
REFERENCES Cost (CostId)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
