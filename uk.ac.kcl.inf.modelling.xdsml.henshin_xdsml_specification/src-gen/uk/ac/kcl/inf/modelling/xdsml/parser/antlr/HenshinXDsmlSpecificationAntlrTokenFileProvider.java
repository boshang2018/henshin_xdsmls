/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.modelling.xdsml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class HenshinXDsmlSpecificationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/modelling/xdsml/parser/antlr/internal/InternalHenshinXDsmlSpecification.tokens");
	}
}
