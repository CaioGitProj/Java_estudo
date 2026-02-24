void main()
{
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("José");
    list.add("Lúcio");
    list.add(1, "Ambrózio");
    list.add(2, "Alvaro");
    list.add("Adolf Wilton");


    IO.println(list.size());
    IO.println(list.indexOf("Ambrózio"));
    IO.println("\n\n");
    for(String nome : list)
    {
        IO.println(nome);
    }


    IO.println("\n\n");
    list.removeIf(x -> x.charAt(0) == 'M');
    for(String nome : list)
    {
        IO.println(nome);
    }

    IO.println("\n\n");
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
    for(String name : result)
    {
        IO.println(name);
    }

    IO.println("\n\n");
    String firstName = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    IO.println(firstName);

}
