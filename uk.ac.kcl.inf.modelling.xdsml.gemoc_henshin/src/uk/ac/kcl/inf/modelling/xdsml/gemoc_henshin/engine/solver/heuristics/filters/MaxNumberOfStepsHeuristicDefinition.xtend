package uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.solver.heuristics.filters

import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Text
import uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.solver.heuristics.Heuristic
import uk.ac.kcl.inf.modelling.xdsml.gemoc_henshin.engine.solver.heuristics.LaunchConfigurationContext

class MaxNumberOfStepsHeuristicDefinition extends FilteringHeuristicDefinition {
	new() {
		super("uk.ac.kcl.inf.xdsml.heuristics.num_steps", "Max Number of Steps Heuristic", MaxNumberOfStepsHeuristic)
	}

	override getUIControl(Composite parent, LaunchConfigurationContext lcc) {
		val control = new Text(parent, SWT.SINGLE.bitwiseOr(SWT.BORDER))
		control.layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false)
		control
	}

	override initaliseControl(Control uiElement, String configData) {
		val txt = uiElement as Text

		try {
			val num = Integer.parseInt(configData)
			txt.text = num.toString
		} catch (NumberFormatException nfe) {
			txt.text = "0"
		}
	}

	override encodeConfigInformation(Control uiElement) {
		val txt = uiElement as Text

		try {
			val num = Integer.parseInt(txt.text)
			num.toString
		} catch (NumberFormatException nfe) {
			"0"
		}
	}

	override initialise(Heuristic heuristic, String configData) {
		val h = heuristic as MaxNumberOfStepsHeuristic

		try {
			val num = Integer.parseInt(configData)
			h.maxNumberOfSteps = num
		} catch (NumberFormatException nfe) {
			System.err.println("Couldn't initalise heuristic: " + nfe.message)
			nfe.printStackTrace
		}
	}
}
