package org.example

import griffon.core.artifact.GriffonModel
import griffon.metadata.ArtifactProviderFor
import javafx.beans.property.IntegerProperty
import javafx.beans.property.SimpleIntegerProperty
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonModel
import tornadofx.*

@ArtifactProviderFor(GriffonModel::class)
class SampleModel : AbstractGriffonModel() {
    private var _clickCount: IntegerProperty = SimpleIntegerProperty(this, "clickCount", 0)
    var clickCount by _clickCount
    fun clickCountProperty() = _clickCount
}