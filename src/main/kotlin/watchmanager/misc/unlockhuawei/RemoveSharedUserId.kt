package app.revanced.patches.watchmanager.misc.unlockhuawei

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Remove sharedUserId from AndroidManifest",
    compatiblePackages = [CompatiblePackage("com.samsung.android.app.watchmanager")]
)
@Suppress("unused")
object RemoveSharedUserId : ResourcePatch() {
    private const val EXPORTED_FLAG = "android:exported"
    override fun execute(context: ResourceContext) {
        context.xmlEditor["AndroidManifest.xml"].use { editor ->
            val document = editor.file
            // val activities = document.getElementsByTagName("activity")

            document.removeAttribute('android:sharedUserId')
        }
    }
}
