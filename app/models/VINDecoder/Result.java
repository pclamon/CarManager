
package models.VINDecoder;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ABS",
        "ActiveSafetySysNote",
        "AdaptiveCruiseControl",
        "AdaptiveDrivingBeam",
        "AdaptiveHeadlights",
        "AdditionalErrorText",
        "AirBagLocCurtain",
        "AirBagLocFront",
        "AirBagLocKnee",
        "AirBagLocSeatCushion",
        "AirBagLocSide",
        "AutoReverseSystem",
        "AutomaticPedestrianAlertingSound",
        "AxleConfiguration",
        "Axles",
        "BasePrice",
        "BatteryA",
        "BatteryA_to",
        "BatteryCells",
        "BatteryInfo",
        "BatteryKWh",
        "BatteryKWh_to",
        "BatteryModules",
        "BatteryPacks",
        "BatteryType",
        "BatteryV",
        "BatteryV_to",
        "BedLengthIN",
        "BedType",
        "BlindSpotMon",
        "BodyCabType",
        "BodyClass",
        "BrakeSystemDesc",
        "BrakeSystemType",
        "BusFloorConfigType",
        "BusLength",
        "BusType",
        "CAN_AACN",
        "CIB",
        "CashForClunkers",
        "ChargerLevel",
        "ChargerPowerKW",
        "CoolingType",
        "CurbWeightLB",
        "CustomMotorcycleType",
        "DaytimeRunningLight",
        "DestinationMarket",
        "DisplacementCC",
        "DisplacementCI",
        "DisplacementL",
        "Doors",
        "DriveType",
        "DriverAssist",
        "DynamicBrakeSupport",
        "EDR",
        "ESC",
        "EVDriveUnit",
        "ElectrificationLevel",
        "EngineConfiguration",
        "EngineCycles",
        "EngineCylinders",
        "EngineHP",
        "EngineHP_to",
        "EngineKW",
        "EngineManufacturer",
        "EngineModel",
        "EntertainmentSystem",
        "ErrorCode",
        "ErrorText",
        "ForwardCollisionWarning",
        "FuelInjectionType",
        "FuelTypePrimary",
        "FuelTypeSecondary",
        "GCWR",
        "GCWR_to",
        "GVWR",
        "GVWR_to",
        "KeylessIgnition",
        "LaneDepartureWarning",
        "LaneKeepSystem",
        "LowerBeamHeadlampLightSource",
        "Make",
        "Manufacturer",
        "ManufacturerId",
        "Model",
        "ModelYear",
        "MotorcycleChassisType",
        "MotorcycleSuspensionType",
        "NCSABodyType",
        "NCSAMake",
        "NCSAMapExcApprovedBy",
        "NCSAMapExcApprovedOn",
        "NCSAMappingException",
        "NCSAModel",
        "NCSANote",
        "Note",
        "OtherBusInfo",
        "OtherEngineInfo",
        "OtherMotorcycleInfo",
        "OtherRestraintSystemInfo",
        "OtherTrailerInfo",
        "ParkAssist",
        "PedestrianAutomaticEmergencyBraking",
        "PlantCity",
        "PlantCompanyName",
        "PlantCountry",
        "PlantState",
        "PossibleValues",
        "Pretensioner",
        "RearCrossTrafficAlert",
        "RearVisibilitySystem",
        "SAEAutomationLevel",
        "SAEAutomationLevel_to",
        "SeatBeltsAll",
        "SeatRows",
        "Seats",
        "SemiautomaticHeadlampBeamSwitching",
        "Series",
        "Series2",
        "SteeringLocation",
        "SuggestedVIN",
        "TPMS",
        "TopSpeedMPH",
        "TrackWidth",
        "TractionControl",
        "TrailerBodyType",
        "TrailerLength",
        "TrailerType",
        "TransmissionSpeeds",
        "TransmissionStyle",
        "Trim",
        "Trim2",
        "Turbo",
        "VIN",
        "ValveTrainDesign",
        "VehicleType",
        "WheelBaseLong",
        "WheelBaseShort",
        "WheelBaseType",
        "WheelSizeFront",
        "WheelSizeRear",
        "Wheels",
        "Windows"
})
public class Result
{

    @JsonProperty("ABS")
    private String aBS;
    @JsonProperty("ActiveSafetySysNote")
    private String activeSafetySysNote;
    @JsonProperty("AdaptiveCruiseControl")
    private String adaptiveCruiseControl;
    @JsonProperty("AdaptiveDrivingBeam")
    private String adaptiveDrivingBeam;
    @JsonProperty("AdaptiveHeadlights")
    private String adaptiveHeadlights;
    @JsonProperty("AdditionalErrorText")
    private String additionalErrorText;
    @JsonProperty("AirBagLocCurtain")
    private String airBagLocCurtain;
    @JsonProperty("AirBagLocFront")
    private String airBagLocFront;
    @JsonProperty("AirBagLocKnee")
    private String airBagLocKnee;
    @JsonProperty("AirBagLocSeatCushion")
    private String airBagLocSeatCushion;
    @JsonProperty("AirBagLocSide")
    private String airBagLocSide;
    @JsonProperty("AutoReverseSystem")
    private String autoReverseSystem;
    @JsonProperty("AutomaticPedestrianAlertingSound")
    private String automaticPedestrianAlertingSound;
    @JsonProperty("AxleConfiguration")
    private String axleConfiguration;
    @JsonProperty("Axles")
    private String axles;
    @JsonProperty("BasePrice")
    private String basePrice;
    @JsonProperty("BatteryA")
    private String batteryA;
    @JsonProperty("BatteryA_to")
    private String batteryATo;
    @JsonProperty("BatteryCells")
    private String batteryCells;
    @JsonProperty("BatteryInfo")
    private String batteryInfo;
    @JsonProperty("BatteryKWh")
    private String batteryKWh;
    @JsonProperty("BatteryKWh_to")
    private String batteryKWhTo;
    @JsonProperty("BatteryModules")
    private String batteryModules;
    @JsonProperty("BatteryPacks")
    private String batteryPacks;
    @JsonProperty("BatteryType")
    private String batteryType;
    @JsonProperty("BatteryV")
    private String batteryV;
    @JsonProperty("BatteryV_to")
    private String batteryVTo;
    @JsonProperty("BedLengthIN")
    private String bedLengthIN;
    @JsonProperty("BedType")
    private String bedType;
    @JsonProperty("BlindSpotMon")
    private String blindSpotMon;
    @JsonProperty("BodyCabType")
    private String bodyCabType;
    @JsonProperty("BodyClass")
    private String bodyClass;
    @JsonProperty("BrakeSystemDesc")
    private String brakeSystemDesc;
    @JsonProperty("BrakeSystemType")
    private String brakeSystemType;
    @JsonProperty("BusFloorConfigType")
    private String busFloorConfigType;
    @JsonProperty("BusLength")
    private String busLength;
    @JsonProperty("BusType")
    private String busType;
    @JsonProperty("CAN_AACN")
    private String cANAACN;
    @JsonProperty("CIB")
    private String cIB;
    @JsonProperty("CashForClunkers")
    private String cashForClunkers;
    @JsonProperty("ChargerLevel")
    private String chargerLevel;
    @JsonProperty("ChargerPowerKW")
    private String chargerPowerKW;
    @JsonProperty("CoolingType")
    private String coolingType;
    @JsonProperty("CurbWeightLB")
    private String curbWeightLB;
    @JsonProperty("CustomMotorcycleType")
    private String customMotorcycleType;
    @JsonProperty("DaytimeRunningLight")
    private String daytimeRunningLight;
    @JsonProperty("DestinationMarket")
    private String destinationMarket;
    @JsonProperty("DisplacementCC")
    private String displacementCC;
    @JsonProperty("DisplacementCI")
    private String displacementCI;
    @JsonProperty("DisplacementL")
    private String displacementL;
    @JsonProperty("Doors")
    private String doors;
    @JsonProperty("DriveType")
    private String driveType;
    @JsonProperty("DriverAssist")
    private String driverAssist;
    @JsonProperty("DynamicBrakeSupport")
    private String dynamicBrakeSupport;
    @JsonProperty("EDR")
    private String eDR;
    @JsonProperty("ESC")
    private String eSC;
    @JsonProperty("EVDriveUnit")
    private String eVDriveUnit;
    @JsonProperty("ElectrificationLevel")
    private String electrificationLevel;
    @JsonProperty("EngineConfiguration")
    private String engineConfiguration;
    @JsonProperty("EngineCycles")
    private String engineCycles;
    @JsonProperty("EngineCylinders")
    private String engineCylinders;
    @JsonProperty("EngineHP")
    private String engineHP;
    @JsonProperty("EngineHP_to")
    private String engineHPTo;
    @JsonProperty("EngineKW")
    private String engineKW;
    @JsonProperty("EngineManufacturer")
    private String engineManufacturer;
    @JsonProperty("EngineModel")
    private String engineModel;
    @JsonProperty("EntertainmentSystem")
    private String entertainmentSystem;
    @JsonProperty("ErrorCode")
    private String errorCode;
    @JsonProperty("ErrorText")
    private String errorText;
    @JsonProperty("ForwardCollisionWarning")
    private String forwardCollisionWarning;
    @JsonProperty("FuelInjectionType")
    private String fuelInjectionType;
    @JsonProperty("FuelTypePrimary")
    private String fuelTypePrimary;
    @JsonProperty("FuelTypeSecondary")
    private String fuelTypeSecondary;
    @JsonProperty("GCWR")
    private String gCWR;
    @JsonProperty("GCWR_to")
    private String gCWRTo;
    @JsonProperty("GVWR")
    private String gVWR;
    @JsonProperty("GVWR_to")
    private String gVWRTo;
    @JsonProperty("KeylessIgnition")
    private String keylessIgnition;
    @JsonProperty("LaneDepartureWarning")
    private String laneDepartureWarning;
    @JsonProperty("LaneKeepSystem")
    private String laneKeepSystem;
    @JsonProperty("LowerBeamHeadlampLightSource")
    private String lowerBeamHeadlampLightSource;
    @JsonProperty("Make")
    private String make;
    @JsonProperty("Manufacturer")
    private String manufacturer;
    @JsonProperty("ManufacturerId")
    private String manufacturerId;
    @JsonProperty("Model")
    private String model;
    @JsonProperty("ModelYear")
    private String modelYear;
    @JsonProperty("MotorcycleChassisType")
    private String motorcycleChassisType;
    @JsonProperty("MotorcycleSuspensionType")
    private String motorcycleSuspensionType;
    @JsonProperty("NCSABodyType")
    private String nCSABodyType;
    @JsonProperty("NCSAMake")
    private String nCSAMake;
    @JsonProperty("NCSAMapExcApprovedBy")
    private String nCSAMapExcApprovedBy;
    @JsonProperty("NCSAMapExcApprovedOn")
    private String nCSAMapExcApprovedOn;
    @JsonProperty("NCSAMappingException")
    private String nCSAMappingException;
    @JsonProperty("NCSAModel")
    private String nCSAModel;
    @JsonProperty("NCSANote")
    private String nCSANote;
    @JsonProperty("Note")
    private String note;
    @JsonProperty("OtherBusInfo")
    private String otherBusInfo;
    @JsonProperty("OtherEngineInfo")
    private String otherEngineInfo;
    @JsonProperty("OtherMotorcycleInfo")
    private String otherMotorcycleInfo;
    @JsonProperty("OtherRestraintSystemInfo")
    private String otherRestraintSystemInfo;
    @JsonProperty("OtherTrailerInfo")
    private String otherTrailerInfo;
    @JsonProperty("ParkAssist")
    private String parkAssist;
    @JsonProperty("PedestrianAutomaticEmergencyBraking")
    private String pedestrianAutomaticEmergencyBraking;
    @JsonProperty("PlantCity")
    private String plantCity;
    @JsonProperty("PlantCompanyName")
    private String plantCompanyName;
    @JsonProperty("PlantCountry")
    private String plantCountry;
    @JsonProperty("PlantState")
    private String plantState;
    @JsonProperty("PossibleValues")
    private String possibleValues;
    @JsonProperty("Pretensioner")
    private String pretensioner;
    @JsonProperty("RearCrossTrafficAlert")
    private String rearCrossTrafficAlert;
    @JsonProperty("RearVisibilitySystem")
    private String rearVisibilitySystem;
    @JsonProperty("SAEAutomationLevel")
    private String sAEAutomationLevel;
    @JsonProperty("SAEAutomationLevel_to")
    private String sAEAutomationLevelTo;
    @JsonProperty("SeatBeltsAll")
    private String seatBeltsAll;
    @JsonProperty("SeatRows")
    private String seatRows;
    @JsonProperty("Seats")
    private String seats;
    @JsonProperty("SemiautomaticHeadlampBeamSwitching")
    private String semiautomaticHeadlampBeamSwitching;
    @JsonProperty("Series")
    private String series;
    @JsonProperty("Series2")
    private String series2;
    @JsonProperty("SteeringLocation")
    private String steeringLocation;
    @JsonProperty("SuggestedVIN")
    private String suggestedVIN;
    @JsonProperty("TPMS")
    private String tPMS;
    @JsonProperty("TopSpeedMPH")
    private String topSpeedMPH;
    @JsonProperty("TrackWidth")
    private String trackWidth;
    @JsonProperty("TractionControl")
    private String tractionControl;
    @JsonProperty("TrailerBodyType")
    private String trailerBodyType;
    @JsonProperty("TrailerLength")
    private String trailerLength;
    @JsonProperty("TrailerType")
    private String trailerType;
    @JsonProperty("TransmissionSpeeds")
    private String transmissionSpeeds;
    @JsonProperty("TransmissionStyle")
    private String transmissionStyle;
    @JsonProperty("Trim")
    private String trim;
    @JsonProperty("Trim2")
    private String trim2;
    @JsonProperty("Turbo")
    private String turbo;
    @JsonProperty("VIN")
    private String vIN;
    @JsonProperty("ValveTrainDesign")
    private String valveTrainDesign;
    @JsonProperty("VehicleType")
    private String vehicleType;
    @JsonProperty("WheelBaseLong")
    private String wheelBaseLong;
    @JsonProperty("WheelBaseShort")
    private String wheelBaseShort;
    @JsonProperty("WheelBaseType")
    private String wheelBaseType;
    @JsonProperty("WheelSizeFront")
    private String wheelSizeFront;
    @JsonProperty("WheelSizeRear")
    private String wheelSizeRear;
    @JsonProperty("Wheels")
    private String wheels;
    @JsonProperty("Windows")
    private String windows;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ABS")
    public String getABS()
    {
        return aBS;
    }

    @JsonProperty("ABS")
    public void setABS(String aBS)
    {
        this.aBS = aBS;
    }

    @JsonProperty("ActiveSafetySysNote")
    public String getActiveSafetySysNote()
    {
        return activeSafetySysNote;
    }

    @JsonProperty("ActiveSafetySysNote")
    public void setActiveSafetySysNote(String activeSafetySysNote)
    {
        this.activeSafetySysNote = activeSafetySysNote;
    }

    @JsonProperty("AdaptiveCruiseControl")
    public String getAdaptiveCruiseControl()
    {
        return adaptiveCruiseControl;
    }

    @JsonProperty("AdaptiveCruiseControl")
    public void setAdaptiveCruiseControl(String adaptiveCruiseControl)
    {
        this.adaptiveCruiseControl = adaptiveCruiseControl;
    }

    @JsonProperty("AdaptiveDrivingBeam")
    public String getAdaptiveDrivingBeam()
    {
        return adaptiveDrivingBeam;
    }

    @JsonProperty("AdaptiveDrivingBeam")
    public void setAdaptiveDrivingBeam(String adaptiveDrivingBeam)
    {
        this.adaptiveDrivingBeam = adaptiveDrivingBeam;
    }

    @JsonProperty("AdaptiveHeadlights")
    public String getAdaptiveHeadlights()
    {
        return adaptiveHeadlights;
    }

    @JsonProperty("AdaptiveHeadlights")
    public void setAdaptiveHeadlights(String adaptiveHeadlights)
    {
        this.adaptiveHeadlights = adaptiveHeadlights;
    }

    @JsonProperty("AdditionalErrorText")
    public String getAdditionalErrorText()
    {
        return additionalErrorText;
    }

    @JsonProperty("AdditionalErrorText")
    public void setAdditionalErrorText(String additionalErrorText)
    {
        this.additionalErrorText = additionalErrorText;
    }

    @JsonProperty("AirBagLocCurtain")
    public String getAirBagLocCurtain()
    {
        return airBagLocCurtain;
    }

    @JsonProperty("AirBagLocCurtain")
    public void setAirBagLocCurtain(String airBagLocCurtain)
    {
        this.airBagLocCurtain = airBagLocCurtain;
    }

    @JsonProperty("AirBagLocFront")
    public String getAirBagLocFront()
    {
        return airBagLocFront;
    }

    @JsonProperty("AirBagLocFront")
    public void setAirBagLocFront(String airBagLocFront)
    {
        this.airBagLocFront = airBagLocFront;
    }

    @JsonProperty("AirBagLocKnee")
    public String getAirBagLocKnee()
    {
        return airBagLocKnee;
    }

    @JsonProperty("AirBagLocKnee")
    public void setAirBagLocKnee(String airBagLocKnee)
    {
        this.airBagLocKnee = airBagLocKnee;
    }

    @JsonProperty("AirBagLocSeatCushion")
    public String getAirBagLocSeatCushion()
    {
        return airBagLocSeatCushion;
    }

    @JsonProperty("AirBagLocSeatCushion")
    public void setAirBagLocSeatCushion(String airBagLocSeatCushion)
    {
        this.airBagLocSeatCushion = airBagLocSeatCushion;
    }

    @JsonProperty("AirBagLocSide")
    public String getAirBagLocSide()
    {
        return airBagLocSide;
    }

    @JsonProperty("AirBagLocSide")
    public void setAirBagLocSide(String airBagLocSide)
    {
        this.airBagLocSide = airBagLocSide;
    }

    @JsonProperty("AutoReverseSystem")
    public String getAutoReverseSystem()
    {
        return autoReverseSystem;
    }

    @JsonProperty("AutoReverseSystem")
    public void setAutoReverseSystem(String autoReverseSystem)
    {
        this.autoReverseSystem = autoReverseSystem;
    }

    @JsonProperty("AutomaticPedestrianAlertingSound")
    public String getAutomaticPedestrianAlertingSound()
    {
        return automaticPedestrianAlertingSound;
    }

    @JsonProperty("AutomaticPedestrianAlertingSound")
    public void setAutomaticPedestrianAlertingSound(String automaticPedestrianAlertingSound)
    {
        this.automaticPedestrianAlertingSound = automaticPedestrianAlertingSound;
    }

    @JsonProperty("AxleConfiguration")
    public String getAxleConfiguration()
    {
        return axleConfiguration;
    }

    @JsonProperty("AxleConfiguration")
    public void setAxleConfiguration(String axleConfiguration)
    {
        this.axleConfiguration = axleConfiguration;
    }

    @JsonProperty("Axles")
    public String getAxles()
    {
        return axles;
    }

    @JsonProperty("Axles")
    public void setAxles(String axles)
    {
        this.axles = axles;
    }

    @JsonProperty("BasePrice")
    public String getBasePrice()
    {
        return basePrice;
    }

    @JsonProperty("BasePrice")
    public void setBasePrice(String basePrice)
    {
        this.basePrice = basePrice;
    }

    @JsonProperty("BatteryA")
    public String getBatteryA()
    {
        return batteryA;
    }

    @JsonProperty("BatteryA")
    public void setBatteryA(String batteryA)
    {
        this.batteryA = batteryA;
    }

    @JsonProperty("BatteryA_to")
    public String getBatteryATo()
    {
        return batteryATo;
    }

    @JsonProperty("BatteryA_to")
    public void setBatteryATo(String batteryATo)
    {
        this.batteryATo = batteryATo;
    }

    @JsonProperty("BatteryCells")
    public String getBatteryCells()
    {
        return batteryCells;
    }

    @JsonProperty("BatteryCells")
    public void setBatteryCells(String batteryCells)
    {
        this.batteryCells = batteryCells;
    }

    @JsonProperty("BatteryInfo")
    public String getBatteryInfo()
    {
        return batteryInfo;
    }

    @JsonProperty("BatteryInfo")
    public void setBatteryInfo(String batteryInfo)
    {
        this.batteryInfo = batteryInfo;
    }

    @JsonProperty("BatteryKWh")
    public String getBatteryKWh()
    {
        return batteryKWh;
    }

    @JsonProperty("BatteryKWh")
    public void setBatteryKWh(String batteryKWh)
    {
        this.batteryKWh = batteryKWh;
    }

    @JsonProperty("BatteryKWh_to")
    public String getBatteryKWhTo()
    {
        return batteryKWhTo;
    }

    @JsonProperty("BatteryKWh_to")
    public void setBatteryKWhTo(String batteryKWhTo)
    {
        this.batteryKWhTo = batteryKWhTo;
    }

    @JsonProperty("BatteryModules")
    public String getBatteryModules()
    {
        return batteryModules;
    }

    @JsonProperty("BatteryModules")
    public void setBatteryModules(String batteryModules)
    {
        this.batteryModules = batteryModules;
    }

    @JsonProperty("BatteryPacks")
    public String getBatteryPacks()
    {
        return batteryPacks;
    }

    @JsonProperty("BatteryPacks")
    public void setBatteryPacks(String batteryPacks)
    {
        this.batteryPacks = batteryPacks;
    }

    @JsonProperty("BatteryType")
    public String getBatteryType()
    {
        return batteryType;
    }

    @JsonProperty("BatteryType")
    public void setBatteryType(String batteryType)
    {
        this.batteryType = batteryType;
    }

    @JsonProperty("BatteryV")
    public String getBatteryV()
    {
        return batteryV;
    }

    @JsonProperty("BatteryV")
    public void setBatteryV(String batteryV)
    {
        this.batteryV = batteryV;
    }

    @JsonProperty("BatteryV_to")
    public String getBatteryVTo()
    {
        return batteryVTo;
    }

    @JsonProperty("BatteryV_to")
    public void setBatteryVTo(String batteryVTo)
    {
        this.batteryVTo = batteryVTo;
    }

    @JsonProperty("BedLengthIN")
    public String getBedLengthIN()
    {
        return bedLengthIN;
    }

    @JsonProperty("BedLengthIN")
    public void setBedLengthIN(String bedLengthIN)
    {
        this.bedLengthIN = bedLengthIN;
    }

    @JsonProperty("BedType")
    public String getBedType()
    {
        return bedType;
    }

    @JsonProperty("BedType")
    public void setBedType(String bedType)
    {
        this.bedType = bedType;
    }

    @JsonProperty("BlindSpotMon")
    public String getBlindSpotMon()
    {
        return blindSpotMon;
    }

    @JsonProperty("BlindSpotMon")
    public void setBlindSpotMon(String blindSpotMon)
    {
        this.blindSpotMon = blindSpotMon;
    }

    @JsonProperty("BodyCabType")
    public String getBodyCabType()
    {
        return bodyCabType;
    }

    @JsonProperty("BodyCabType")
    public void setBodyCabType(String bodyCabType)
    {
        this.bodyCabType = bodyCabType;
    }

    @JsonProperty("BodyClass")
    public String getBodyClass()
    {
        return bodyClass;
    }

    @JsonProperty("BodyClass")
    public void setBodyClass(String bodyClass)
    {
        this.bodyClass = bodyClass;
    }

    @JsonProperty("BrakeSystemDesc")
    public String getBrakeSystemDesc()
    {
        return brakeSystemDesc;
    }

    @JsonProperty("BrakeSystemDesc")
    public void setBrakeSystemDesc(String brakeSystemDesc)
    {
        this.brakeSystemDesc = brakeSystemDesc;
    }

    @JsonProperty("BrakeSystemType")
    public String getBrakeSystemType()
    {
        return brakeSystemType;
    }

    @JsonProperty("BrakeSystemType")
    public void setBrakeSystemType(String brakeSystemType)
    {
        this.brakeSystemType = brakeSystemType;
    }

    @JsonProperty("BusFloorConfigType")
    public String getBusFloorConfigType()
    {
        return busFloorConfigType;
    }

    @JsonProperty("BusFloorConfigType")
    public void setBusFloorConfigType(String busFloorConfigType)
    {
        this.busFloorConfigType = busFloorConfigType;
    }

    @JsonProperty("BusLength")
    public String getBusLength()
    {
        return busLength;
    }

    @JsonProperty("BusLength")
    public void setBusLength(String busLength)
    {
        this.busLength = busLength;
    }

    @JsonProperty("BusType")
    public String getBusType()
    {
        return busType;
    }

    @JsonProperty("BusType")
    public void setBusType(String busType)
    {
        this.busType = busType;
    }

    @JsonProperty("CAN_AACN")
    public String getCANAACN()
    {
        return cANAACN;
    }

    @JsonProperty("CAN_AACN")
    public void setCANAACN(String cANAACN)
    {
        this.cANAACN = cANAACN;
    }

    @JsonProperty("CIB")
    public String getCIB()
    {
        return cIB;
    }

    @JsonProperty("CIB")
    public void setCIB(String cIB)
    {
        this.cIB = cIB;
    }

    @JsonProperty("CashForClunkers")
    public String getCashForClunkers()
    {
        return cashForClunkers;
    }

    @JsonProperty("CashForClunkers")
    public void setCashForClunkers(String cashForClunkers)
    {
        this.cashForClunkers = cashForClunkers;
    }

    @JsonProperty("ChargerLevel")
    public String getChargerLevel()
    {
        return chargerLevel;
    }

    @JsonProperty("ChargerLevel")
    public void setChargerLevel(String chargerLevel)
    {
        this.chargerLevel = chargerLevel;
    }

    @JsonProperty("ChargerPowerKW")
    public String getChargerPowerKW()
    {
        return chargerPowerKW;
    }

    @JsonProperty("ChargerPowerKW")
    public void setChargerPowerKW(String chargerPowerKW)
    {
        this.chargerPowerKW = chargerPowerKW;
    }

    @JsonProperty("CoolingType")
    public String getCoolingType()
    {
        return coolingType;
    }

    @JsonProperty("CoolingType")
    public void setCoolingType(String coolingType)
    {
        this.coolingType = coolingType;
    }

    @JsonProperty("CurbWeightLB")
    public String getCurbWeightLB()
    {
        return curbWeightLB;
    }

    @JsonProperty("CurbWeightLB")
    public void setCurbWeightLB(String curbWeightLB)
    {
        this.curbWeightLB = curbWeightLB;
    }

    @JsonProperty("CustomMotorcycleType")
    public String getCustomMotorcycleType()
    {
        return customMotorcycleType;
    }

    @JsonProperty("CustomMotorcycleType")
    public void setCustomMotorcycleType(String customMotorcycleType)
    {
        this.customMotorcycleType = customMotorcycleType;
    }

    @JsonProperty("DaytimeRunningLight")
    public String getDaytimeRunningLight()
    {
        return daytimeRunningLight;
    }

    @JsonProperty("DaytimeRunningLight")
    public void setDaytimeRunningLight(String daytimeRunningLight)
    {
        this.daytimeRunningLight = daytimeRunningLight;
    }

    @JsonProperty("DestinationMarket")
    public String getDestinationMarket()
    {
        return destinationMarket;
    }

    @JsonProperty("DestinationMarket")
    public void setDestinationMarket(String destinationMarket)
    {
        this.destinationMarket = destinationMarket;
    }

    @JsonProperty("DisplacementCC")
    public String getDisplacementCC()
    {
        return displacementCC;
    }

    @JsonProperty("DisplacementCC")
    public void setDisplacementCC(String displacementCC)
    {
        this.displacementCC = displacementCC;
    }

    @JsonProperty("DisplacementCI")
    public String getDisplacementCI()
    {
        return displacementCI;
    }

    @JsonProperty("DisplacementCI")
    public void setDisplacementCI(String displacementCI)
    {
        this.displacementCI = displacementCI;
    }

    @JsonProperty("DisplacementL")
    public String getDisplacementL()
    {
        return displacementL;
    }

    @JsonProperty("DisplacementL")
    public void setDisplacementL(String displacementL)
    {
        this.displacementL = displacementL;
    }

    @JsonProperty("Doors")
    public String getDoors()
    {
        return doors;
    }

    @JsonProperty("Doors")
    public void setDoors(String doors)
    {
        this.doors = doors;
    }

    @JsonProperty("DriveType")
    public String getDriveType()
    {
        return driveType;
    }

    @JsonProperty("DriveType")
    public void setDriveType(String driveType)
    {
        this.driveType = driveType;
    }

    @JsonProperty("DriverAssist")
    public String getDriverAssist()
    {
        return driverAssist;
    }

    @JsonProperty("DriverAssist")
    public void setDriverAssist(String driverAssist)
    {
        this.driverAssist = driverAssist;
    }

    @JsonProperty("DynamicBrakeSupport")
    public String getDynamicBrakeSupport()
    {
        return dynamicBrakeSupport;
    }

    @JsonProperty("DynamicBrakeSupport")
    public void setDynamicBrakeSupport(String dynamicBrakeSupport)
    {
        this.dynamicBrakeSupport = dynamicBrakeSupport;
    }

    @JsonProperty("EDR")
    public String getEDR()
    {
        return eDR;
    }

    @JsonProperty("EDR")
    public void setEDR(String eDR)
    {
        this.eDR = eDR;
    }

    @JsonProperty("ESC")
    public String getESC()
    {
        return eSC;
    }

    @JsonProperty("ESC")
    public void setESC(String eSC)
    {
        this.eSC = eSC;
    }

    @JsonProperty("EVDriveUnit")
    public String getEVDriveUnit()
    {
        return eVDriveUnit;
    }

    @JsonProperty("EVDriveUnit")
    public void setEVDriveUnit(String eVDriveUnit)
    {
        this.eVDriveUnit = eVDriveUnit;
    }

    @JsonProperty("ElectrificationLevel")
    public String getElectrificationLevel()
    {
        return electrificationLevel;
    }

    @JsonProperty("ElectrificationLevel")
    public void setElectrificationLevel(String electrificationLevel)
    {
        this.electrificationLevel = electrificationLevel;
    }

    @JsonProperty("EngineConfiguration")
    public String getEngineConfiguration()
    {
        return engineConfiguration;
    }

    @JsonProperty("EngineConfiguration")
    public void setEngineConfiguration(String engineConfiguration)
    {
        this.engineConfiguration = engineConfiguration;
    }

    @JsonProperty("EngineCycles")
    public String getEngineCycles()
    {
        return engineCycles;
    }

    @JsonProperty("EngineCycles")
    public void setEngineCycles(String engineCycles)
    {
        this.engineCycles = engineCycles;
    }

    @JsonProperty("EngineCylinders")
    public String getEngineCylinders()
    {
        return engineCylinders;
    }

    @JsonProperty("EngineCylinders")
    public void setEngineCylinders(String engineCylinders)
    {
        this.engineCylinders = engineCylinders;
    }

    @JsonProperty("EngineHP")
    public String getEngineHP()
    {
        return engineHP;
    }

    @JsonProperty("EngineHP")
    public void setEngineHP(String engineHP)
    {
        this.engineHP = engineHP;
    }

    @JsonProperty("EngineHP_to")
    public String getEngineHPTo()
    {
        return engineHPTo;
    }

    @JsonProperty("EngineHP_to")
    public void setEngineHPTo(String engineHPTo)
    {
        this.engineHPTo = engineHPTo;
    }

    @JsonProperty("EngineKW")
    public String getEngineKW()
    {
        return engineKW;
    }

    @JsonProperty("EngineKW")
    public void setEngineKW(String engineKW)
    {
        this.engineKW = engineKW;
    }

    @JsonProperty("EngineManufacturer")
    public String getEngineManufacturer()
    {
        return engineManufacturer;
    }

    @JsonProperty("EngineManufacturer")
    public void setEngineManufacturer(String engineManufacturer)
    {
        this.engineManufacturer = engineManufacturer;
    }

    @JsonProperty("EngineModel")
    public String getEngineModel()
    {
        return engineModel;
    }

    @JsonProperty("EngineModel")
    public void setEngineModel(String engineModel)
    {
        this.engineModel = engineModel;
    }

    @JsonProperty("EntertainmentSystem")
    public String getEntertainmentSystem()
    {
        return entertainmentSystem;
    }

    @JsonProperty("EntertainmentSystem")
    public void setEntertainmentSystem(String entertainmentSystem)
    {
        this.entertainmentSystem = entertainmentSystem;
    }

    @JsonProperty("ErrorCode")
    public String getErrorCode()
    {
        return errorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    @JsonProperty("ErrorText")
    public String getErrorText()
    {
        return errorText;
    }

    @JsonProperty("ErrorText")
    public void setErrorText(String errorText)
    {
        this.errorText = errorText;
    }

    @JsonProperty("ForwardCollisionWarning")
    public String getForwardCollisionWarning()
    {
        return forwardCollisionWarning;
    }

    @JsonProperty("ForwardCollisionWarning")
    public void setForwardCollisionWarning(String forwardCollisionWarning)
    {
        this.forwardCollisionWarning = forwardCollisionWarning;
    }

    @JsonProperty("FuelInjectionType")
    public String getFuelInjectionType()
    {
        return fuelInjectionType;
    }

    @JsonProperty("FuelInjectionType")
    public void setFuelInjectionType(String fuelInjectionType)
    {
        this.fuelInjectionType = fuelInjectionType;
    }

    @JsonProperty("FuelTypePrimary")
    public String getFuelTypePrimary()
    {
        return fuelTypePrimary;
    }

    @JsonProperty("FuelTypePrimary")
    public void setFuelTypePrimary(String fuelTypePrimary)
    {
        this.fuelTypePrimary = fuelTypePrimary;
    }

    @JsonProperty("FuelTypeSecondary")
    public String getFuelTypeSecondary()
    {
        return fuelTypeSecondary;
    }

    @JsonProperty("FuelTypeSecondary")
    public void setFuelTypeSecondary(String fuelTypeSecondary)
    {
        this.fuelTypeSecondary = fuelTypeSecondary;
    }

    @JsonProperty("GCWR")
    public String getGCWR()
    {
        return gCWR;
    }

    @JsonProperty("GCWR")
    public void setGCWR(String gCWR)
    {
        this.gCWR = gCWR;
    }

    @JsonProperty("GCWR_to")
    public String getGCWRTo()
    {
        return gCWRTo;
    }

    @JsonProperty("GCWR_to")
    public void setGCWRTo(String gCWRTo)
    {
        this.gCWRTo = gCWRTo;
    }

    @JsonProperty("GVWR")
    public String getGVWR()
    {
        return gVWR;
    }

    @JsonProperty("GVWR")
    public void setGVWR(String gVWR)
    {
        this.gVWR = gVWR;
    }

    @JsonProperty("GVWR_to")
    public String getGVWRTo()
    {
        return gVWRTo;
    }

    @JsonProperty("GVWR_to")
    public void setGVWRTo(String gVWRTo)
    {
        this.gVWRTo = gVWRTo;
    }

    @JsonProperty("KeylessIgnition")
    public String getKeylessIgnition()
    {
        return keylessIgnition;
    }

    @JsonProperty("KeylessIgnition")
    public void setKeylessIgnition(String keylessIgnition)
    {
        this.keylessIgnition = keylessIgnition;
    }

    @JsonProperty("LaneDepartureWarning")
    public String getLaneDepartureWarning()
    {
        return laneDepartureWarning;
    }

    @JsonProperty("LaneDepartureWarning")
    public void setLaneDepartureWarning(String laneDepartureWarning)
    {
        this.laneDepartureWarning = laneDepartureWarning;
    }

    @JsonProperty("LaneKeepSystem")
    public String getLaneKeepSystem()
    {
        return laneKeepSystem;
    }

    @JsonProperty("LaneKeepSystem")
    public void setLaneKeepSystem(String laneKeepSystem)
    {
        this.laneKeepSystem = laneKeepSystem;
    }

    @JsonProperty("LowerBeamHeadlampLightSource")
    public String getLowerBeamHeadlampLightSource()
    {
        return lowerBeamHeadlampLightSource;
    }

    @JsonProperty("LowerBeamHeadlampLightSource")
    public void setLowerBeamHeadlampLightSource(String lowerBeamHeadlampLightSource)
    {
        this.lowerBeamHeadlampLightSource = lowerBeamHeadlampLightSource;
    }

    @JsonProperty("Make")
    public String getMake()
    {
        return make;
    }

    @JsonProperty("Make")
    public void setMake(String make)
    {
        this.make = make;
    }

    @JsonProperty("Manufacturer")
    public String getManufacturer()
    {
        return manufacturer;
    }

    @JsonProperty("Manufacturer")
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    @JsonProperty("ManufacturerId")
    public String getManufacturerId()
    {
        return manufacturerId;
    }

    @JsonProperty("ManufacturerId")
    public void setManufacturerId(String manufacturerId)
    {
        this.manufacturerId = manufacturerId;
    }

    @JsonProperty("Model")
    public String getModel()
    {
        return model;
    }

    @JsonProperty("Model")
    public void setModel(String model)
    {
        this.model = model;
    }

    @JsonProperty("ModelYear")
    public String getModelYear()
    {
        return modelYear;
    }

    @JsonProperty("ModelYear")
    public void setModelYear(String modelYear)
    {
        this.modelYear = modelYear;
    }

    @JsonProperty("MotorcycleChassisType")
    public String getMotorcycleChassisType()
    {
        return motorcycleChassisType;
    }

    @JsonProperty("MotorcycleChassisType")
    public void setMotorcycleChassisType(String motorcycleChassisType)
    {
        this.motorcycleChassisType = motorcycleChassisType;
    }

    @JsonProperty("MotorcycleSuspensionType")
    public String getMotorcycleSuspensionType()
    {
        return motorcycleSuspensionType;
    }

    @JsonProperty("MotorcycleSuspensionType")
    public void setMotorcycleSuspensionType(String motorcycleSuspensionType)
    {
        this.motorcycleSuspensionType = motorcycleSuspensionType;
    }

    @JsonProperty("NCSABodyType")
    public String getNCSABodyType()
    {
        return nCSABodyType;
    }

    @JsonProperty("NCSABodyType")
    public void setNCSABodyType(String nCSABodyType)
    {
        this.nCSABodyType = nCSABodyType;
    }

    @JsonProperty("NCSAMake")
    public String getNCSAMake()
    {
        return nCSAMake;
    }

    @JsonProperty("NCSAMake")
    public void setNCSAMake(String nCSAMake)
    {
        this.nCSAMake = nCSAMake;
    }

    @JsonProperty("NCSAMapExcApprovedBy")
    public String getNCSAMapExcApprovedBy()
    {
        return nCSAMapExcApprovedBy;
    }

    @JsonProperty("NCSAMapExcApprovedBy")
    public void setNCSAMapExcApprovedBy(String nCSAMapExcApprovedBy)
    {
        this.nCSAMapExcApprovedBy = nCSAMapExcApprovedBy;
    }

    @JsonProperty("NCSAMapExcApprovedOn")
    public String getNCSAMapExcApprovedOn()
    {
        return nCSAMapExcApprovedOn;
    }

    @JsonProperty("NCSAMapExcApprovedOn")
    public void setNCSAMapExcApprovedOn(String nCSAMapExcApprovedOn)
    {
        this.nCSAMapExcApprovedOn = nCSAMapExcApprovedOn;
    }

    @JsonProperty("NCSAMappingException")
    public String getNCSAMappingException()
    {
        return nCSAMappingException;
    }

    @JsonProperty("NCSAMappingException")
    public void setNCSAMappingException(String nCSAMappingException)
    {
        this.nCSAMappingException = nCSAMappingException;
    }

    @JsonProperty("NCSAModel")
    public String getNCSAModel()
    {
        return nCSAModel;
    }

    @JsonProperty("NCSAModel")
    public void setNCSAModel(String nCSAModel)
    {
        this.nCSAModel = nCSAModel;
    }

    @JsonProperty("NCSANote")
    public String getNCSANote()
    {
        return nCSANote;
    }

    @JsonProperty("NCSANote")
    public void setNCSANote(String nCSANote)
    {
        this.nCSANote = nCSANote;
    }

    @JsonProperty("Note")
    public String getNote()
    {
        return note;
    }

    @JsonProperty("Note")
    public void setNote(String note)
    {
        this.note = note;
    }

    @JsonProperty("OtherBusInfo")
    public String getOtherBusInfo()
    {
        return otherBusInfo;
    }

    @JsonProperty("OtherBusInfo")
    public void setOtherBusInfo(String otherBusInfo)
    {
        this.otherBusInfo = otherBusInfo;
    }

    @JsonProperty("OtherEngineInfo")
    public String getOtherEngineInfo()
    {
        return otherEngineInfo;
    }

    @JsonProperty("OtherEngineInfo")
    public void setOtherEngineInfo(String otherEngineInfo)
    {
        this.otherEngineInfo = otherEngineInfo;
    }

    @JsonProperty("OtherMotorcycleInfo")
    public String getOtherMotorcycleInfo()
    {
        return otherMotorcycleInfo;
    }

    @JsonProperty("OtherMotorcycleInfo")
    public void setOtherMotorcycleInfo(String otherMotorcycleInfo)
    {
        this.otherMotorcycleInfo = otherMotorcycleInfo;
    }

    @JsonProperty("OtherRestraintSystemInfo")
    public String getOtherRestraintSystemInfo()
    {
        return otherRestraintSystemInfo;
    }

    @JsonProperty("OtherRestraintSystemInfo")
    public void setOtherRestraintSystemInfo(String otherRestraintSystemInfo)
    {
        this.otherRestraintSystemInfo = otherRestraintSystemInfo;
    }

    @JsonProperty("OtherTrailerInfo")
    public String getOtherTrailerInfo()
    {
        return otherTrailerInfo;
    }

    @JsonProperty("OtherTrailerInfo")
    public void setOtherTrailerInfo(String otherTrailerInfo)
    {
        this.otherTrailerInfo = otherTrailerInfo;
    }

    @JsonProperty("ParkAssist")
    public String getParkAssist()
    {
        return parkAssist;
    }

    @JsonProperty("ParkAssist")
    public void setParkAssist(String parkAssist)
    {
        this.parkAssist = parkAssist;
    }

    @JsonProperty("PedestrianAutomaticEmergencyBraking")
    public String getPedestrianAutomaticEmergencyBraking()
    {
        return pedestrianAutomaticEmergencyBraking;
    }

    @JsonProperty("PedestrianAutomaticEmergencyBraking")
    public void setPedestrianAutomaticEmergencyBraking(String pedestrianAutomaticEmergencyBraking)
    {
        this.pedestrianAutomaticEmergencyBraking = pedestrianAutomaticEmergencyBraking;
    }

    @JsonProperty("PlantCity")
    public String getPlantCity()
    {
        return plantCity;
    }

    @JsonProperty("PlantCity")
    public void setPlantCity(String plantCity)
    {
        this.plantCity = plantCity;
    }

    @JsonProperty("PlantCompanyName")
    public String getPlantCompanyName()
    {
        return plantCompanyName;
    }

    @JsonProperty("PlantCompanyName")
    public void setPlantCompanyName(String plantCompanyName)
    {
        this.plantCompanyName = plantCompanyName;
    }

    @JsonProperty("PlantCountry")
    public String getPlantCountry()
    {
        return plantCountry;
    }

    @JsonProperty("PlantCountry")
    public void setPlantCountry(String plantCountry)
    {
        this.plantCountry = plantCountry;
    }

    @JsonProperty("PlantState")
    public String getPlantState()
    {
        return plantState;
    }

    @JsonProperty("PlantState")
    public void setPlantState(String plantState)
    {
        this.plantState = plantState;
    }

    @JsonProperty("PossibleValues")
    public String getPossibleValues()
    {
        return possibleValues;
    }

    @JsonProperty("PossibleValues")
    public void setPossibleValues(String possibleValues)
    {
        this.possibleValues = possibleValues;
    }

    @JsonProperty("Pretensioner")
    public String getPretensioner()
    {
        return pretensioner;
    }

    @JsonProperty("Pretensioner")
    public void setPretensioner(String pretensioner)
    {
        this.pretensioner = pretensioner;
    }

    @JsonProperty("RearCrossTrafficAlert")
    public String getRearCrossTrafficAlert()
    {
        return rearCrossTrafficAlert;
    }

    @JsonProperty("RearCrossTrafficAlert")
    public void setRearCrossTrafficAlert(String rearCrossTrafficAlert)
    {
        this.rearCrossTrafficAlert = rearCrossTrafficAlert;
    }

    @JsonProperty("RearVisibilitySystem")
    public String getRearVisibilitySystem()
    {
        return rearVisibilitySystem;
    }

    @JsonProperty("RearVisibilitySystem")
    public void setRearVisibilitySystem(String rearVisibilitySystem)
    {
        this.rearVisibilitySystem = rearVisibilitySystem;
    }

    @JsonProperty("SAEAutomationLevel")
    public String getSAEAutomationLevel()
    {
        return sAEAutomationLevel;
    }

    @JsonProperty("SAEAutomationLevel")
    public void setSAEAutomationLevel(String sAEAutomationLevel)
    {
        this.sAEAutomationLevel = sAEAutomationLevel;
    }

    @JsonProperty("SAEAutomationLevel_to")
    public String getSAEAutomationLevelTo()
    {
        return sAEAutomationLevelTo;
    }

    @JsonProperty("SAEAutomationLevel_to")
    public void setSAEAutomationLevelTo(String sAEAutomationLevelTo)
    {
        this.sAEAutomationLevelTo = sAEAutomationLevelTo;
    }

    @JsonProperty("SeatBeltsAll")
    public String getSeatBeltsAll()
    {
        return seatBeltsAll;
    }

    @JsonProperty("SeatBeltsAll")
    public void setSeatBeltsAll(String seatBeltsAll)
    {
        this.seatBeltsAll = seatBeltsAll;
    }

    @JsonProperty("SeatRows")
    public String getSeatRows()
    {
        return seatRows;
    }

    @JsonProperty("SeatRows")
    public void setSeatRows(String seatRows)
    {
        this.seatRows = seatRows;
    }

    @JsonProperty("Seats")
    public String getSeats()
    {
        return seats;
    }

    @JsonProperty("Seats")
    public void setSeats(String seats)
    {
        this.seats = seats;
    }

    @JsonProperty("SemiautomaticHeadlampBeamSwitching")
    public String getSemiautomaticHeadlampBeamSwitching()
    {
        return semiautomaticHeadlampBeamSwitching;
    }

    @JsonProperty("SemiautomaticHeadlampBeamSwitching")
    public void setSemiautomaticHeadlampBeamSwitching(String semiautomaticHeadlampBeamSwitching)
    {
        this.semiautomaticHeadlampBeamSwitching = semiautomaticHeadlampBeamSwitching;
    }

    @JsonProperty("Series")
    public String getSeries()
    {
        return series;
    }

    @JsonProperty("Series")
    public void setSeries(String series)
    {
        this.series = series;
    }

    @JsonProperty("Series2")
    public String getSeries2()
    {
        return series2;
    }

    @JsonProperty("Series2")
    public void setSeries2(String series2)
    {
        this.series2 = series2;
    }

    @JsonProperty("SteeringLocation")
    public String getSteeringLocation()
    {
        return steeringLocation;
    }

    @JsonProperty("SteeringLocation")
    public void setSteeringLocation(String steeringLocation)
    {
        this.steeringLocation = steeringLocation;
    }

    @JsonProperty("SuggestedVIN")
    public String getSuggestedVIN()
    {
        return suggestedVIN;
    }

    @JsonProperty("SuggestedVIN")
    public void setSuggestedVIN(String suggestedVIN)
    {
        this.suggestedVIN = suggestedVIN;
    }

    @JsonProperty("TPMS")
    public String getTPMS()
    {
        return tPMS;
    }

    @JsonProperty("TPMS")
    public void setTPMS(String tPMS)
    {
        this.tPMS = tPMS;
    }

    @JsonProperty("TopSpeedMPH")
    public String getTopSpeedMPH()
    {
        return topSpeedMPH;
    }

    @JsonProperty("TopSpeedMPH")
    public void setTopSpeedMPH(String topSpeedMPH)
    {
        this.topSpeedMPH = topSpeedMPH;
    }

    @JsonProperty("TrackWidth")
    public String getTrackWidth()
    {
        return trackWidth;
    }

    @JsonProperty("TrackWidth")
    public void setTrackWidth(String trackWidth)
    {
        this.trackWidth = trackWidth;
    }

    @JsonProperty("TractionControl")
    public String getTractionControl()
    {
        return tractionControl;
    }

    @JsonProperty("TractionControl")
    public void setTractionControl(String tractionControl)
    {
        this.tractionControl = tractionControl;
    }

    @JsonProperty("TrailerBodyType")
    public String getTrailerBodyType()
    {
        return trailerBodyType;
    }

    @JsonProperty("TrailerBodyType")
    public void setTrailerBodyType(String trailerBodyType)
    {
        this.trailerBodyType = trailerBodyType;
    }

    @JsonProperty("TrailerLength")
    public String getTrailerLength()
    {
        return trailerLength;
    }

    @JsonProperty("TrailerLength")
    public void setTrailerLength(String trailerLength)
    {
        this.trailerLength = trailerLength;
    }

    @JsonProperty("TrailerType")
    public String getTrailerType()
    {
        return trailerType;
    }

    @JsonProperty("TrailerType")
    public void setTrailerType(String trailerType)
    {
        this.trailerType = trailerType;
    }

    @JsonProperty("TransmissionSpeeds")
    public String getTransmissionSpeeds()
    {
        return transmissionSpeeds;
    }

    @JsonProperty("TransmissionSpeeds")
    public void setTransmissionSpeeds(String transmissionSpeeds)
    {
        this.transmissionSpeeds = transmissionSpeeds;
    }

    @JsonProperty("TransmissionStyle")
    public String getTransmissionStyle()
    {
        return transmissionStyle;
    }

    @JsonProperty("TransmissionStyle")
    public void setTransmissionStyle(String transmissionStyle)
    {
        this.transmissionStyle = transmissionStyle;
    }

    @JsonProperty("Trim")
    public String getTrim()
    {
        return trim;
    }

    @JsonProperty("Trim")
    public void setTrim(String trim)
    {
        this.trim = trim;
    }

    @JsonProperty("Trim2")
    public String getTrim2()
    {
        return trim2;
    }

    @JsonProperty("Trim2")
    public void setTrim2(String trim2)
    {
        this.trim2 = trim2;
    }

    @JsonProperty("Turbo")
    public String getTurbo()
    {
        return turbo;
    }

    @JsonProperty("Turbo")
    public void setTurbo(String turbo)
    {
        this.turbo = turbo;
    }

    @JsonProperty("VIN")
    public String getVIN()
    {
        return vIN;
    }

    @JsonProperty("VIN")
    public void setVIN(String vIN)
    {
        this.vIN = vIN;
    }

    @JsonProperty("ValveTrainDesign")
    public String getValveTrainDesign()
    {
        return valveTrainDesign;
    }

    @JsonProperty("ValveTrainDesign")
    public void setValveTrainDesign(String valveTrainDesign)
    {
        this.valveTrainDesign = valveTrainDesign;
    }

    @JsonProperty("VehicleType")
    public String getVehicleType()
    {
        return vehicleType;
    }

    @JsonProperty("VehicleType")
    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    @JsonProperty("WheelBaseLong")
    public String getWheelBaseLong()
    {
        return wheelBaseLong;
    }

    @JsonProperty("WheelBaseLong")
    public void setWheelBaseLong(String wheelBaseLong)
    {
        this.wheelBaseLong = wheelBaseLong;
    }

    @JsonProperty("WheelBaseShort")
    public String getWheelBaseShort()
    {
        return wheelBaseShort;
    }

    @JsonProperty("WheelBaseShort")
    public void setWheelBaseShort(String wheelBaseShort)
    {
        this.wheelBaseShort = wheelBaseShort;
    }

    @JsonProperty("WheelBaseType")
    public String getWheelBaseType()
    {
        return wheelBaseType;
    }

    @JsonProperty("WheelBaseType")
    public void setWheelBaseType(String wheelBaseType)
    {
        this.wheelBaseType = wheelBaseType;
    }

    @JsonProperty("WheelSizeFront")
    public String getWheelSizeFront()
    {
        return wheelSizeFront;
    }

    @JsonProperty("WheelSizeFront")
    public void setWheelSizeFront(String wheelSizeFront)
    {
        this.wheelSizeFront = wheelSizeFront;
    }

    @JsonProperty("WheelSizeRear")
    public String getWheelSizeRear()
    {
        return wheelSizeRear;
    }

    @JsonProperty("WheelSizeRear")
    public void setWheelSizeRear(String wheelSizeRear)
    {
        this.wheelSizeRear = wheelSizeRear;
    }

    @JsonProperty("Wheels")
    public String getWheels()
    {
        return wheels;
    }

    @JsonProperty("Wheels")
    public void setWheels(String wheels)
    {
        this.wheels = wheels;
    }

    @JsonProperty("Windows")
    public String getWindows()
    {
        return windows;
    }

    @JsonProperty("Windows")
    public void setWindows(String windows)
    {
        this.windows = windows;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value)
    {
        this.additionalProperties.put(name, value);
    }

}