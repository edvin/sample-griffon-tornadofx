package org.example

import griffon.core.artifact.GriffonController
import griffon.core.controller.ControllerAction
import griffon.inject.MVCMember
import griffon.metadata.ArtifactProviderFor
import griffon.transform.Threading
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonController
import javax.annotation.Nonnull

@ArtifactProviderFor(GriffonController::class)
class SampleController : AbstractGriffonController() {
    @set:[MVCMember Nonnull]
    lateinit var model: SampleModel

    @ControllerAction
    @Threading(Threading.Policy.INSIDE_UITHREAD_ASYNC)
    fun click() {
        model.clickCount = model.clickCount + 1
    }
}