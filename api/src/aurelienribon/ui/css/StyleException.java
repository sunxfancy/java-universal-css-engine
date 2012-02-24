package aurelienribon.ui.css;

/**
 * Just an exception raised while parsing a CSS stylesheet, if anything is
 * wrong.
 *
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class StyleException extends RuntimeException {
	public static StyleException forProperty(String name) {
		return new StyleException("Property \"" + name + "\" is not registered.");
	}

	public static StyleException forPropertyParams(Property property) {
		return new StyleException("Bad parameter(s) for property \"" + property.getName() + "\"");
	}

	public static StyleException forFunction(String name) {
		return new StyleException("Function \"" + name + "\" is not registered.");
	}

	public static StyleException forFunctionParams(Function function) {
		return new StyleException("Bad parameter(s) for function \"" + function.getName() + "\"");
	}

	public static StyleException forFunctionParamKeyword(Function function, int paramId, String... keywords) {
		return new StyleException("Bad parameter(s) for function \"" + function.getName() + "\"");
	}

	public StyleException(String msg) {
		super(msg);
	}
}
