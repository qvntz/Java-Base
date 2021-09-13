private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();
        for (String r: roles) {
            int counter = 1;
            String role = r;
            if (r.charAt(r.length() - 1) != ':'){
                res.append(r.concat(":"));
                role = role.concat(":");
            }
            else {
                res.append(r);
            }

            for (String line: textLines) {
                if (line.startsWith(role)){
                    int k = line.indexOf(": ");
                    res.append("\n".concat(Integer.toString(counter)).concat(")").concat(line.substring(k + 1)));
                }
                counter++;
            }
            if (!roles[roles.length - 1].equalsIgnoreCase(r))
                res.append("\n\n");
        }
        return res.toString();
    }