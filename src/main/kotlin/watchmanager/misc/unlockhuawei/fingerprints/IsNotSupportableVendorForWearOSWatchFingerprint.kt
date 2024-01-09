package app.revanced.patches.watchmanager.misc.unlockhuawei.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

internal object IsNotSupportableVendorForWearOSWatchFingerprint : MethodFingerprint(
    returnType = "Z",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.STATIC,
    strings = listOf(
        " isNotSupportableVendorForWearOSWatch"
    )
)
