package app.revanced.patches.watchmanager.misc.unlockhuawei

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.extensions.InstructionExtensions.addInstructions
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.watchmanager.misc.unlockhuawei.fingerprints.IsNotSupportableVendorForWearOSWatchFingerprint

@Patch(
    name = "Unlock Huawei",
    compatiblePackages = [CompatiblePackage("com.samsung.android.app.watchmanager")]
)
@Suppress("unused")
object UnlockHuaweiPatch : BytecodePatch(
    setOf(IsNotSupportableVendorForWearOSWatchFingerprint)
) {
    override fun execute(context: BytecodeContext) {
        val method = IsNotSupportableVendorForWearOSWatchFingerprint.result!!.mutableMethod
        method.addInstructions(
            0,
            """
                const/4 v0, 0x0
                return v0
            """
        )
    }
}