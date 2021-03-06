package fr.minemobs.superpackutils.init;

import fr.minemobs.superpackutils.Main;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.GasBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import java.awt.Color;

public class GasesInit {

    public static final DeferredRegister<Gas> GASES = DeferredRegister.create(Gas.class, Main.MOD_ID);

    public static final RegistryObject<Gas> ETHYL_CHLORIDE = GASES.register("ethyl_chloride", () -> new Gas(GasBuilder.builder().color(new Color(201, 201, 201).getRGB())));
    public static final RegistryObject<Gas> SILICON_DIOXIDE = GASES.register("silicon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(167, 203, 217).getRGB())));
    public static final RegistryObject<Gas> POLYETHENE = GASES.register("polyethene", () -> new Gas(GasBuilder.builder().color(new Color(168, 143, 189).getRGB())));
    public static final RegistryObject<Gas> CHEMICAL_DEATH = GASES.register("chemical_death", () -> new Gas(GasBuilder.builder().color(new Color(133, 136, 140).getRGB())));
    public static final RegistryObject<Gas> NITROGEN = GASES.register("nitrogen", () -> new Gas(GasBuilder.builder().color(new Color(154, 171, 242).getRGB())));
    public static final RegistryObject<Gas> NITROUS_OXIDE = GASES.register("nitrous_oxide", () -> new Gas(GasBuilder.builder().color(new Color(64, 77, 133).getRGB())));
    public static final RegistryObject<Gas> STABILIZER = GASES.register("stabilizer", () -> new Gas(GasBuilder.builder().color(new Color(71, 151, 214).getRGB())));
    public static final RegistryObject<Gas> AMMONIA = GASES.register("ammonia", () -> new Gas(GasBuilder.builder().color(new Color(155, 180, 186).getRGB())));
    public static final RegistryObject<Gas> CYANIDE = GASES.register("cyanide", () -> new Gas(GasBuilder.builder().color(new Color(230, 230, 230).getRGB())));
    public static final RegistryObject<Gas> CARBON_DIOXIDE = GASES.register("carbon_dioxide", () -> new Gas(GasBuilder.builder().color(new Color(13, 13, 13).getRGB())));
    public static final RegistryObject<Gas> METHANE = GASES.register("methane", () -> new Gas(GasBuilder.builder().color(new Color(171, 130, 166).getRGB())));
    public static final RegistryObject<Gas> PURE_SULFURIC_ACID = GASES.register("pure_sulfuric_acid", () -> new Gas(GasBuilder.builder().color(new Color(150, 146, 59).getRGB())));
    public static final RegistryObject<Gas> BENZENE = GASES.register("benzene", () -> new Gas(GasBuilder.builder().color(new Color(200, 209, 176).getRGB())));
    public static final RegistryObject<Gas> BUTADIENE = GASES.register("butadiene", () -> new Gas(GasBuilder.builder().color(new Color(184, 209, 176).getRGB())));
    public static final RegistryObject<Gas> ABS = GASES.register("abs", () -> new Gas(GasBuilder.builder().color(new Color(196, 196, 196).getRGB())));
    public static final RegistryObject<Gas> ACRYLONITRILE = GASES.register("acrylonitrile", () -> new Gas(GasBuilder.builder().color(new Color(192, 209, 171).getRGB())));
    public static final RegistryObject<Gas> STYRENE = GASES.register("styrene", () -> new Gas(GasBuilder.builder().color(new Color(117, 122, 111).getRGB())));
    public static final RegistryObject<Gas> ETHYL_BENZENE = GASES.register("ethyl_benzene", () -> new Gas(GasBuilder.builder().color(new Color(170, 179, 159).getRGB())));
    public static final RegistryObject<Gas> TOLUENE = GASES.register("toluene", () -> new Gas(GasBuilder.builder().color(new Color(145, 117, 89).getRGB())));
    public static final RegistryObject<Gas> OCTANE = GASES.register("octane", () -> new Gas(GasBuilder.builder().color(new Color(151, 158, 125).getRGB())));
    public static final RegistryObject<Gas> BUTANE = GASES.register("butane", () -> new Gas(GasBuilder.builder().color(new Color(171, 128, 36).getRGB())));
    public static final RegistryObject<Gas> BUTENE = GASES.register("butene", () -> new Gas(GasBuilder.builder().color(new Color(209, 172, 92).getRGB())));
    public static final RegistryObject<Gas> PROPANE = GASES.register("propane", () -> new Gas(GasBuilder.builder().color(new Color(153, 150, 60).getRGB())));
    public static final RegistryObject<Gas> PROPENE = GASES.register("propene", () -> new Gas(GasBuilder.builder().color(new Color(212, 207, 59).getRGB())));
    public static final RegistryObject<Gas> ETBE = GASES.register("etbe", () -> new Gas(GasBuilder.builder().color(new Color(199, 194, 185).getRGB())));
    public static final RegistryObject<Gas> ISOPRENE = GASES.register("isoprene", () -> new Gas(GasBuilder.builder().color(new Color(56, 41, 34).getRGB())));
    public static final RegistryObject<Gas> BORIC_ACID = GASES.register("boric_acid", () -> new Gas(GasBuilder.builder().color(new Color(117, 100, 53).getRGB())));
    public static final RegistryObject<Gas> DIBORANE = GASES.register("diborane", () -> new Gas(GasBuilder.builder().color(new Color(148, 81, 109).getRGB())));
    public static final RegistryObject<Gas> PLASTIC_WASTE = GASES.register("plastic_waste", () -> new Gas(GasBuilder.builder().color(new Color(97, 70, 54).getRGB())));
    public static final RegistryObject<Gas> ACETYLENE = GASES.register("acetylene", () -> new Gas(GasBuilder.builder().color(new Color(191, 128, 164).getRGB())));
    public static final RegistryObject<Gas> HYDROGEN_CYANIDE = GASES.register("hydrogen_cyanide", () -> new Gas(GasBuilder.builder().color(new Color(114, 85, 161).getRGB())));
    public static final RegistryObject<Gas> HELIUM = GASES.register("helium", () -> new Gas(GasBuilder.builder().color(new Color(234, 217, 194).getRGB())));
    public static final RegistryObject<Gas> SILICON_TETRACHLORIDE = GASES.register("silicon_tetrachloride", () -> new Gas(GasBuilder.builder().color(new Color(65, 86, 140).getRGB())));
    public static final RegistryObject<Gas> CHLOROFORM = GASES.register("chloroform", () -> new Gas(GasBuilder.builder().color(new Color(94, 65, 140).getRGB())));
    public static final RegistryObject<Gas> CUMENE = GASES.register("cumene", () -> new Gas(GasBuilder.builder().color(new Color(190, 207, 157).getRGB())));
    public static final RegistryObject<Gas> ACETONE = GASES.register("acetone", () -> new Gas(GasBuilder.builder().color(new Color(188, 227, 162).getRGB())));
    public static final RegistryObject<Gas> SODIUM_CHLORIDE = GASES.register("sodium_chloride", () -> new Gas(GasBuilder.builder().color(new Color(117, 155, 252).getRGB())));
    public static final RegistryObject<Gas> SODIUM_HYPOCHLORITE = GASES.register("sodium_hypochlorite", () -> new Gas(GasBuilder.builder().color(new Color(168, 202, 243).getRGB())));
    public static final RegistryObject<Gas> PHENOL = GASES.register("phenol", () -> new Gas(GasBuilder.builder().color(new Color(118, 41, 72).getRGB())));
    public static final RegistryObject<Gas> BISPHENOL_A = GASES.register("bisphenol_a", () -> new Gas(GasBuilder.builder().color(new Color(110, 41, 118).getRGB())));
    public static final RegistryObject<Gas> POLYSTYRENE = GASES.register("polystyrene", () -> new Gas(GasBuilder.builder().color(new Color(199, 170, 114).getRGB())));
    public static final RegistryObject<Gas> VINYL_CHLORIDE = GASES.register("vinyl_chloride", () -> new Gas(GasBuilder.builder().color(new Color(70, 236, 153).getRGB())));
    public static final RegistryObject<Gas> POLYVINYL_CHLORIDE = GASES.register("polyvinyl_chloride", () -> new Gas(GasBuilder.builder().color(new Color(0, 128, 75).getRGB())));
    public static final RegistryObject<Gas> ACETIC_ACID = GASES.register("acetic_acid", () -> new Gas(GasBuilder.builder().color(new Color(176, 176, 158).getRGB())));
    public static final RegistryObject<Gas> METHANOL = GASES.register("methanol", () -> new Gas(GasBuilder.builder().color(new Color(92, 65, 18).getRGB())));
    public static final RegistryObject<Gas> SODIUM_HYDROXIDE = GASES.register("sodium_hydroxide", () -> new Gas(GasBuilder.builder().color(new Color(29, 168, 141).getRGB())));
    public static final RegistryObject<Gas> FLUORINE = GASES.register("fluorine", () -> new Gas(GasBuilder.builder().color(new Color(113, 240, 233).getRGB())));
    public static final RegistryObject<Gas> METHYL_ACETATE = GASES.register("methyl_acetate", () -> new Gas(GasBuilder.builder().color(new Color(137, 144, 151).getRGB())));
    public static final RegistryObject<Gas> MERCURY = GASES.register("mercury", () -> new Gas(GasBuilder.builder().color(new Color(189, 174, 72).getRGB())));
    public static final RegistryObject<Gas> BORAX = GASES.register("borax", () -> new Gas(GasBuilder.builder().color(new Color(142, 182, 215, 196).getRGB())));
    public static final RegistryObject<Gas> BORON = GASES.register("boron", () -> new Gas(GasBuilder.builder().color(new Color(50, 189, 0, 196).getRGB())));
    public static final RegistryObject<Gas> SODIUM_BISULFATE = GASES.register("sodium_bisulfate", () -> new Gas(GasBuilder.builder().color(new Color(93, 217, 167).getRGB())));
    public static final RegistryObject<Gas> SODIUM_CYANIDE = GASES.register("sodium_cyanide", () -> new Gas(GasBuilder.builder().color(new Color(126, 183, 210).getRGB())));
    public static final RegistryObject<Gas> BENZYL_CHLORIDE = GASES.register("benzyl_chloride", () -> new Gas(GasBuilder.builder().color(new Color(102, 89, 53).getRGB())));
    public static final RegistryObject<Gas> NITRIC_ACID = GASES.register("nitric_acid", () -> new Gas(GasBuilder.builder().color(new Color(179, 178, 86).getRGB())));
    public static final RegistryObject<Gas> HYDROGEN_SULFIDE = GASES.register("hydrogen_sulfide", () -> new Gas(GasBuilder.builder().color(new Color(227, 220, 86).getRGB())));
    public static final RegistryObject<Gas> NEON = GASES.register("neon", () -> new Gas(GasBuilder.builder().color(new Color(109, 129, 161).getRGB())));
    public static final RegistryObject<Gas> ARGON = GASES.register("argon", () -> new Gas(GasBuilder.builder().color(new Color(111, 176, 123).getRGB())));
    public static final RegistryObject<Gas> KRYPTON = GASES.register("krypton", () -> new Gas(GasBuilder.builder().color(new Color(58, 76, 134).getRGB())));
    public static final RegistryObject<Gas> XENON = GASES.register("xenon", () -> new Gas(GasBuilder.builder().color(new Color(99, 70, 145).getRGB())));
    public static final RegistryObject<Gas> RADON = GASES.register("radon", () -> new Gas(GasBuilder.builder().color(new Color(145, 70, 130).getRGB())));

    public static final RegistryObject<Gas> BN_SOLUTION = GASES.register("bn_solution", () -> new Gas(GasBuilder.builder().color(new Color(87, 109, 125).getRGB())));
    public static final RegistryObject<Gas> BA_SOLUTION = GASES.register("ba_solution", () -> new Gas(GasBuilder.builder().color(new Color(120, 146, 165).getRGB())));

    public static final RegistryObject<Gas> CHEMICAL_REFINED_REDSTONE = GASES.register("chemical_refined_redstone", () -> new Gas(GasBuilder.builder().color(new Color(187, 55, 43).getRGB())));
    public static final RegistryObject<Gas> CHEMICAL_REFINED_GLOWSTONE = GASES.register("chemical_refined_glowstone", () -> new Gas(GasBuilder.builder().color(new Color(255, 197, 123).getRGB())));
    public static final RegistryObject<Gas> CHEMICAL_REFINED_ENDER = GASES.register("chemical_refined_ender", () -> new Gas(GasBuilder.builder().color(new Color(55, 121, 139).getRGB())));

    public static final RegistryObject<Gas> ST_FUEL = GASES.register("st_fuel", () -> new Gas(GasBuilder.builder().color(new Color(153, 112, 230).getRGB())));

    public static final RegistryObject<Gas> TELLURIUM = GASES.register("tellurium", () -> new Gas(GasBuilder.builder().color(new Color(0, 255, 177).getRGB())));
    public static final RegistryObject<Gas> SELENIUM = GASES.register("selenium", () -> new Gas(GasBuilder.builder().color(new Color(235, 204, 52).getRGB())));

    private static RegistryObject<Gas> register(String name, Color color) {
        return GASES.register(name.toLowerCase().replaceAll("\\s+", "_"), () -> new Gas(GasBuilder.builder().color(color.getRGB())));
    }

}