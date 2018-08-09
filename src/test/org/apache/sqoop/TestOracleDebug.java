/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop;
import org.apache.sqoop.testutil.ImportJobTestCase;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
public class TestOracleDebug extends ImportJobTestCase {
    protected String[] getArgv() {
        ArrayList<String> args = new ArrayList<String>();
        args.add("-D");
        args.add("sqoop.root.logger=DEBUG,console");
        args.add("-D");
        args.add("oraoop.logging.level=DEBUG");
        args.add("--connect");
        args.add("jdbc:oracle:thin:@//vasassqoop.vpc.cloudera.com:1521/sqoop");
        args.add("--username");
        args.add("SYSTEM");
        args.add("--password");
        args.add("Sqoop12345");
        args.add("--table");
        args.add("EMPLOYEES");
        args.add("--direct");
        args.add("--num-mappers");
        args.add("2");
        args.add("--delete-target-dir");
        args.add("--validate");
        args.add("--verbose");
        return args.toArray(new String[0]);
    }
    @Test
    public void test() throws IOException {
        String[] argv = getArgv();
        runImport(argv);
    }
}