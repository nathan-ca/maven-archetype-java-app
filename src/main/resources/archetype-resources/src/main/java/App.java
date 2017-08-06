#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package};

import org.slf4j.LoggerFactory;

public class App 
{
    public static void main( String[] args )
    {
        LoggerFactory.getLogger(App.class).info( "Hello World!" );
    }
}
