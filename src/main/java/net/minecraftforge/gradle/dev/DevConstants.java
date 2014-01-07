package net.minecraftforge.gradle.dev;

import net.minecraftforge.gradle.common.Constants;

final class DevConstants
{
    private DevConstants()
    {

    }

    static final String INSTALLER_URL       = "http://files.minecraftforge.net/installer/forge-installer-{INSTALLER_VERSION}-shrunk.jar";
    static final String LAUNCH4J_URL        = "http://files.minecraftforge.net/launch4j/launch4j-3.0.0-"+Constants.OPERATING_SYSTEM+"-"+Constants.SYSTEM_ARCH+".zip";

    static final String DEOBF_DATA          = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_srg/{MC_VERSION}/deobfuscation_data-{MC_VERSION}.lzma";
    
    public static final String MC_JSON_URL  = "http://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/{MC_VERSION}.json";

    // other generated stuff
    static final String INSTALLER_BASE      = "{BUILD_DIR}/tmp/installer_base.{INSTALLER_VERSION}.jar";
    static final String INSTALL_PROFILE     = "{BUILD_DIR}/tmp/install_profile.json";
    static final String REOBF_TMP           = "{BUILD_DIR}/tmp/recomp_obfed.jar";
    static final String MCP_2_SRG_SRG       = "{BUILD_DIR}/tmp/mcp2srg.srg";
    static final String MCP_2_NOTCH_SRG     = "{BUILD_DIR}/tmp/mcp2notch.srg";
    static final String NOTCH_2_MCP_SRG     = "{BUILD_DIR}/tmp/notch2mcp.srg";
    static final String JAVADOC_TMP         = "{BUILD_DIR}/tmp/javadoc";
    static final String BINPATCH_TMP        = "{BUILD_DIR}/tmp/bin_patches.jar";
    static final String LAUNCH4J_DIR        = "{BUILD_DIR}/launch4j_exec";
    static final String VERSION_JSON        = "{BUILD_DIR}/tmp/version.json";

    // mappings
    static final String METHODS_CSV         = "{MAPPINGS_DIR}/methods.csv";
    static final String FIELDS_CSV          = "{MAPPINGS_DIR}/fields.csv";
    static final String PARAMS_CSV          = "{MAPPINGS_DIR}/params.csv";
    static final String PACK_CSV            = "{MAPPINGS_DIR}/packages.csv";
    static final String JOINED_SRG          = "{MAPPINGS_DIR}/joined.srg";
    static final String JOINED_EXC          = "{MAPPINGS_DIR}/joined.exc";
    static final String ASTYLE_CFG          = "{MAPPINGS_DIR}/astyle.cfg";
    static final String EXC_JSON            = "{MAPPINGS_DIR}/exceptor.json";
    static final String MCP_PATCH           = "{MAPPINGS_DIR}/patches/minecraft_ff.patch";
    static final String MCP_PATCH_DIR       = "{MAPPINGS_DIR}/patches/minecraft_ff";
    static final String MERGE_CFG           = "{FML_DIR}/mcp_merge.cfg";

    // jars.
    static final String JAR_SRG_FML         = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_srg/{MC_VERSION}/minecraft_srg_fml-{MC_VERSION}.jar";
    static final String JAR_SRG_FORGE       = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_srg/{MC_VERSION}/minecraft_srg_forge-{MC_VERSION}.jar";
    static final String JAR_SRG_MCPC        = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_srg/{MC_VERSION}/minecraft_srg_mcpc-{MC_VERSION}.jar";
    static final String ZIP_DECOMP_FML      = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_decomp/{MC_VERSION}/minecraft_decomp_fml-{MC_VERSION}.zip";
    static final String ZIP_DECOMP_FORGE    = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_decomp/{MC_VERSION}/minecraft_decomp_forge-{MC_VERSION}.zip";
    static final String ZIP_DECOMP_MCPC     = "{CACHE_DIR}/minecraft/net/minecraft/minecraft_decomp/{MC_VERSION}/minecraft_decomp_mcpc-{MC_VERSION}.zip";
    static final String LAUNCH4J            = "{CACHE_DIR}/minecraft/launch4j.zip";

    // fml intermediate jars
    static final String ZIP_PATCHED_FML     = "{BUILD_DIR}/fmlTmp/minecraft_patched.zip";

    // forge intermediate jars
    static final String ZIP_FMLED_FORGE     = "{BUILD_DIR}/forgeTmp/minecraft_fmlpatched.zip";
    static final String ZIP_INJECT_FORGE    = "{BUILD_DIR}/forgeTmp/minecraft_fmlinjected.zip";
    static final String ZIP_RENAMED_FORGE   = "{BUILD_DIR}/forgeTmp/minecraft_renamed.zip";
    static final String ZIP_PATCHED_FORGE   = "{BUILD_DIR}/forgeTmp/minecraft_patches.zip";
    
    // mcpc intermediate jars
    static final String ZIP_FMLED_MCPC     = "{BUILD_DIR}/mcpcTmp/minecraft_fmlpatched.zip";
    static final String ZIP_INJECT_MCPC    = "{BUILD_DIR}/mcpcTmp/minecraft_fmlinjected.zip";
    static final String ZIP_RENAMED_MCPC   = "{BUILD_DIR}/mcpcTmp/minecraft_renamed.zip";
    static final String ZIP_FORGED_MCPC    = "{BUILD_DIR}/mcpcTmp/minecraft_forged.zip";
    static final String ZIP_PATCHED_MCPC   = "{BUILD_DIR}/mcpcTmp/minecraft_patched.zip";

    // other stuff
    static final String CHANGELOG           = "{BUILD_DIR}/distributions/{PROJECT}-{MC_VERSION}-{VERSION}-changelog.txt";

    // jsons
    static final String JSON_DEV            = "{FML_DIR}/jsons/{MC_VERSION}-dev.json";
    static final String JSON_REL            = "{FML_DIR}/jsons/{MC_VERSION}-rel.json";
    static final String JSON_BASE           = "{FML_DIR}/jsons/{MC_VERSION}.json";

    // eclipse folders      More stuff only for the Dev plugins
    static final String WORKSPACE_ZIP       = "eclipse-workspace-dev.zip";
    static final String WORKSPACE           = "eclipse";
    static final String ECLIPSE_CLEAN       = WORKSPACE + "/Clean";
    static final String ECLIPSE_CLEAN_SRC   = ECLIPSE_CLEAN + "/src/main/java";
    static final String ECLIPSE_CLEAN_RES   = ECLIPSE_CLEAN + "/src/main/resources";
    static final String ECLIPSE_FML         = WORKSPACE + "/FML";
    static final String ECLIPSE_FML_SRC     = ECLIPSE_FML + "/src/main/java";
    static final String ECLIPSE_FML_RES     = ECLIPSE_FML + "/src/main/resources";
    static final String ECLIPSE_FORGE       = WORKSPACE + "/Forge";
    static final String ECLIPSE_FORGE_SRC   = ECLIPSE_FORGE + "/src/main/java";
    static final String ECLIPSE_FORGE_RES   = ECLIPSE_FORGE + "/src/main/resources";
    static final String ECLIPSE_MCPC       = WORKSPACE + "/MCPC";
    static final String ECLIPSE_MCPC_SRC   = ECLIPSE_MCPC + "/src/main/java";
    static final String ECLIPSE_MCPC_RES   = ECLIPSE_MCPC + "/src/main/resources";
    static final String ECLIPSE_RUN         = WORKSPACE + "/run";
    static final String ECLIPSE_NATIVES     = ECLIPSE_RUN + "/bin/natives";
    static final String ECLIPSE_ASSETS      = ECLIPSE_RUN + "/assets";

    // FML stuff only...
    static final String FML_PATCH_DIR       = "{FML_DIR}/patches/minecraft";
    static final String FML_SOURCES         = "{FML_DIR}/src/main/java";
    static final String FML_RESOURCES       = "{FML_DIR}/src/main/resources";
    static final String FML_TEST_SOURCES    = "{FML_DIR}/src/test/java";
    static final String FML_VERSIONF        = "{FML_DIR}/build/tmp/fmlversion.properties";
    static final String FML_LICENSE         = "{FML_DIR}/LICENSE-fml.txt";
    static final String FML_CREDITS         = "{FML_DIR}/CREDITS-fml.txt";
    static final String FML_LOGO            = "{FML_DIR}/jsons/big_logo.png";

    // Forge stuff only
    static final String FORGE_PATCH_DIR     = "{FORGE_DIR}/patches/minecraft";
    static final String FORGE_SOURCES       = "{FORGE_DIR}/src/main/java";
    static final String FORGE_RESOURCES     = "{FORGE_DIR}/src/main/resources";
    static final String FORGE_TEST_SOURCES  = "{FORGE_DIR}/src/test/java";
    static final String FORGE_LICENSE       = "{FORGE_DIR}/MinecraftForge-License.txt";
    static final String FORGE_CREDITS       = "{FORGE_DIR}/MinecraftForge-Credits.txt";
    static final String PAULSCODE_LISCENCE1 = "{FORGE_DIR}/Paulscode IBXM Library License.txt";
    static final String PAULSCODE_LISCENCE2 = "{FORGE_DIR}/Paulscode SoundSystem CodecIBXM License.txt";
    static final String FORGE_LOGO          = FORGE_RESOURCES + "/forge_logo.png";
    static final String FORGE_VERSION_JAVA  = FORGE_SOURCES + "/net/minecraftforge/common/ForgeVersion.java";
    
    // MCPC+ stuff only
    static final String MCPC_PATCH_DIR      = "patches";
    static final String MCPC_SOURCES        = "src/main/java";
    static final String MCPC_RESOURCES      = "src/main/resources";
    static final String MCPC_TEST_SOURCES   = "src/test/java";
}
