package m1.sir.classcounter_maven_plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * A goal to generate code.
 * 
 * @goal count
 * @phase compile
 * 
 * @author MDian
 *
 */
public class ClassCounterMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello World");
	}

}
