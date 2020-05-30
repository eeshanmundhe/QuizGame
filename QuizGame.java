import java.io.*;
public class newquiz
{

    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);

    String Thanks = "";//Used to display Thank You along with the user's name
    int y;//to calculate the length of the string
    int answer[] = new int[10];//to accept the answer from the user    
    int i;//for loop variable
    String subject;//to display the subject taken in the result
    float percent;//calculate and display the percentage scored
    int marks = 0;//to store and display the marks obtained
    String name;//to store the name of the player
    long l;//for loop variable
    int exit = 1;//to ask whether the user wants to exit or continue
    int z;//for loop variable
    int selectsubject;//to select the subject to attempt
    int continuequiz;//to continue quiz after reading instructions
    boolean flag;//to store true or false
    int result;//to display result

    String maths[] = {"Which polygon has six sides?",
            "Which number is not a multiple of six?",
            "Which figure has 4 lines of symmetry?",
            "What is the square of 15?",
            "What is the cube root of fourth power of 64?",
            "Complete the Pythagorean Triplet- 24,32 and__________ ",
            "What is known as the Ramanujam's number?",
            "What is the value of pi among these?",
            "Which of these is not a prime number?",
            "Which number is a perfect square?",
            "Which figure has no line of symmetry?",
            "What is the probability of a sure event?",
            "What is the arithmetic mean of 6,36 and 66?",
            "What is the LCM of 35 and 63?",
            "What is the GCD of 37 and 73?",
            "What is the other name of X axis?",
            "Which triangle has 2 sides equal?",
            "Which of these is not a test for congruency",
            "1 Km = ________________________ mm",
            "When will $8000 become $9261 at 10% half yearly CI?"};

    String mathoption1[] = {"Hexagon","6","Rectangle","255","256","16",
            "1779","3.1415926536","955","2367","Regular Hexagon","0","36",
            "2205","4","ordinate","Equilateral Triangle","ASA","10000",
            "18 months"};

    String mathoption2[] = {"6-gon","66","Parallelogram","225","24","40",
            "1279","3.1415926535","809","65478","Regular 14-Gon",
            "Cant say,depends on the event","6","1.8","3","Absicca",
            "Isosceles Triangle","AAS","1000000000","36 months"};

    String mathoption3[] = {"Sixagon","36","Square","265","21.33","56",
            "1729","22/7","173","65536","Parallelogram","0.5","66","49",
            "2","Alternate Y axis","Scalene Triangle","RHS","1000000",
            "12 months"};

    String mathoption4[] = {"Septagon","669","Arrow Head","275","64",
            "64","1927","157/50","137","4835802","kite","1","108",
            "315","1","None of the above","Right angled Triangle",
            "AAA","1000","Never"};

    int mathanswer[] = {1,4,3,2,1,2,3,2,1,3,3,4,1,4,4,2,2,4,3,1};

    String physics[] = {"What is the CGS unit of force?",
            "Who invented microscope?",
            "When does the Celsius scale coincide with Fahrenheit?",
            "Name the material used as fuse wire",
            "SONAR is based on which principal",
            "The energy conversion in a working generator",
            "The device used to measure Mass is",
            "The device used to measure weight is",
            "The refractive index of diamond is",
            "The single pulley with Mechanical Advantage more than 1 is",
            "The subjective property of sound related to its frequency",
            "The subjective property of light related to its wavelength",
            "The device used to transform 12V a.c to 200V a.c is",
            "The principal on which a transformer works is",
            "Substance with zero resistance at zero Kelvin is called ",
            "1 kilowatt hour = _________________MJ?",
            "The absolute unit of power in the S.I system is________",
            "The capacity of a body to work is called _____________",
            "Door is a lever of which order?",
            "Where is the centre of gravity of a ring?"};

    String physicsoption1[] = {"newton","Zacharias Jansen","40°",
            "Alloy of Pb and Sn","Reflection of Ultasonic waves",
            "Mechanical to electrical","Spring Balance","Wind vane",
            "1.33","Single Fixed Pulley","Wavelength","Velocity",
            "Step Down Transformer","Principal of mixtures",
            "Super Resistor","36","Watt","Power","I Order",
            "At the centre of the Earth"};

    String physicsoption2[] = {"erg","Robert Hooke","66°",
            "Alloy of Pb and Zn","Refraction of Ultrasonic waves",
            "Electrical to mechanical","Physical Balance","Computer","1.5",
            "Single Movable pulley","Colour","invisibility",
            "Step Up Transformer","Mutual Induction","Super Insulator",
            "1000","What","Strength","II Order",
            "On the circumference of the ring"};

    String physicsoption3[] = {"dyne","Charles Darwin","0°",
            "Alloy of Zn and Sn","Reflection of infrasonic waves",
            "Chemical to electrical","Calorimeter","Spring Balance",
            "2.50","Rusted Single Fixed pulley","Pitch","Frequency",
            "Voltmeter","Mutual Conduction","Super Conductor","3.6",
            "Kilowatt","Ability","III order","Outside the ring"};

    String physicsoption4[] = {"joule","Dr. Homi Bhaba","-40°","Tungsten",
            "Refraction of Infrasonic waves","Electrical to mechanical",
            "Thermometer","Physical balance","2.42","None of these",
            "Waveform","Colour","Calculator","Mutual Repulsion",
            "Super Nova","10","kiloWhat","Energy","It is not a lever",
            "At the centre of the ring"};

    int physicsanswer[] = {3,1,4,1,1,1,2,3,4,2,3,4,2,2,3,3,1,4,2,4};       

    String chemistry[] = {"An example of complex salt is_____________",
            "The ogranic compound mixed with ethanol to make it spurious is",
            "The number of shells present in the valence shells of halogen",
            "Losing of electron/electrons is called ",
            "Which of these is a weak organic acid?",
            "Name the process of manufacturing ammonia",
            "The catalyst used in habers process is",
            "The two gases which can be studied using Fountain Experiment",
            "An aqueous salt solution for testing Sulphate radical",
            "Hydroxide of which metal is soluble in NaOH solution?",
            "Which metal is liquid at room temperature?",
            "Alkali metals are placed in which group?",
            "The brown ring test is used for detection of ___________",
            "The number of C-H bonds in ethane molecule is___________",
            "Unsaturated Hydrocarbons undergo_____________ reaction",
            "The Vapour Density of Carbon Dioxide is_____________",
            "_________________ is an alkaline earth metal",
            "Element in period 3 with 0 electron affinity",
            "____________________ is a weak electrolyte",
            "What is IUPAC"};

    String chemistryoption1[] = {"Zinc Sulphate","Methanol","1","Displacement",
            "Formic acid","Contact process","Nickel","HCl gas and HBr gas",
            "Aqua Fortis","Magnesium","Gold","1","Carbonates","4","Substitution",
            "44","Pottasium","Neon","Sodium Chloride Solution",
            ""};

    String chemistryoption2[] = {"Sodium Hydrogen Sulphate","Methanoic acid",
            "7","Reduction","Sulphuric acid","Bosch Process",
            "Finely Divided Iron","Ammonia and Oxygen","Barium Chloride","Lead",
            "Silver","17","Nitrates","8","Oxidation","66","Lead","Xenon",
            "Dilute HCl","International Union of Practical and Analytical Chemistry"};

    String chemistryoption3[] = {"Iron(II)Sulphate","Methanal","3","Oxidation",
            "Hydrochloric acid","Habers Process","Finely Multiplied Iron",
            "HCl gas and Oxygen","Sodium Hydroxide","Silver","Platinum","11",
            "Nitrides","6","Addition","88","Copper","Krypton",
            "Aqueous Acetic Acid",
            "International Union of Perfect and Applied Computers"};

    String chemistryoption4[] = {"Tetrammine copper(II)Sulphate","Ethanoic acid",
            "5","Redox","Nitric acid","Ostwald's process","Chromium",
            "HCl gas and Ammonia Gas","Calcium Carbonate","Copper","Mercury",
            "18","Chlorides","10","No","12","Calcium","Argon",
            "Dilute Sulphuric Acid",
            "International Union of Perfect Applied Commerce"};

    int chemistryanswer[] = {4,1,2,3,1,3,2,4,2,2,4,1,2,3,3,1,4,4,3,1};    

    String biology[] = {"What is NADP?","What is the meaning of BCG?",
            "Which nerve present in the eye helps us to see?",
            "What is the fluid present in the median canal of Cochlea?",
            "What is ADP?","What is CSF",
            "Living or dead cells absorb water by surface attraction by__________",
            "The phase of cardiac cycle in which auricles contract is___________",
            "The organ producing urea is _____________",
            "Hormone which increases reabsoption from kidney tubules",
            "BCG is used to build immunity against",
            "Part of eye where rod and cone cells are located",
            "Lens used to correct Myopia is____________",
            "What is Formalin?","Membrane allowing passage of molecules selectively",
            "The Suppressed allele of a gene is_________________",
            "Statistical study of human population is called _____________",
            "Number of live births per 1000 people of population per year is________",
            "Scientific name of plant on which Mendel conducted his experiment",
            "Name the part of the body which is the seat of intelligence"};

    String biologyoption1[] = {"Nicotinamide Adenine Dinucleotide Phosphate",
            "Borivali Cricket Ground","Olfactory","Perilymph","Anti Doping Programme",
            "Cerebro Spinal Fluid","Hallucination","Atrial Systole","Kidney",
            "ACTH","Cancer","Cornea","Convex Lens","Antibiotic","Permeable Membrane",
            "Dominant","Demography","Mortality","Pisum sativum","Cerebellum"};        

    String biologyoption2[] = {"National Advanced Development Programme",
            "Beryllium Carbide Gas","Auditory","Endolymph","Adenosine Diphosphate",
            "Ceresis Spinal Fluid","Imbibition","Atrial Diastole","Brain","ADH","AIDS",
            "Choroid","Bifocal Lens","Pesticide","Semi-Permeable Membrane",
            "Invalid","Democracy","Rate of Increase of population","Green Pea","Knee"};

    String biologyoption3[] = {"National Agricultural Development Programme",
            "Bordeaux Calamine Gorilla","Optic","Cerebro Spinal Fluid",
            "African Development Programme","Both 1 and 2","Diffusion",
            "Ventricular sytsole","Liver","LH","Tuberculosis","Sclera",
            "Magnifying Lens","Fertilizer","Impermeable Membrane","Recessive",
            "Census","Natality","Groundnut","Spinal Cord"};

    String biologyoption4[] = {"Naturally Acquired Deficiency Problem",
            "Bacillus of Calmette and Guerin","All","Mucus","Africa's Daily Photographs",
            "None","Osmosis","None of these","Heart","TSH","Malaria","Retina",
            "Concave Lens","Disinfectant","None of these","Suppresion",
            "Populationology","None of these","Agaricus bisporous","Cerebrum"};

    int biologyanswer[] = {1,4,3,2,2,1,2,1,3,2,3,4,4,4,2,3,1,3,1,4};

    String calculation[] = {"What is the square root of 0?",
            "What is 7*48*37*0?",
            "What is √[(6000÷30)*50]?",
            "What is tan 0°*sin 30°?",
            "6723-3567=________________________",
            "564+35+325+764-564-764=_______________________",
            "√122 is ~ ___________________",
            "10 square *√10square =______________________",
            "√24336 is = __________________",
            "√75*√3 = _________________________",
            "Which number is divisible by 9?",
            "Which number is a multiple of 8?",
            "What is the square of 1111?",
            "What is the remainder when 576 is divided by 15?",
            "The largest number using 0-9 once is_________________",
            "The smallest number using 0-9 once is_________________",
            "Solve :\n\n\t\t2x + 5y = 0  -(i)\n\t\t5x + 2y = 21 -(ii)",
            "Find D when :\n\n\t\tb = 6\n\t\ta = 1\n\t\tc = 5",
            "Solve the following quadratic Equation:\n\n\t\tx2 - 9x + 20 = 0",
            "Find the volume of a cone with:\n\n\t\tr = 7\n\t\th = 6"};

    String calculationoption1[] = {"∞","0","10","√3","2156","0","11","10000","165","√15",
            "366","512","43214321","76","9087654321","0123456789","x=-2 and y=5","±4",
            "x = 4 or x = 5","308 units"};

    String calculationoption2[] = {"0","12432","1000","1/√3","3636","350","10","1000","156",
            "55","666","844","12341234","561","4531267890","1023456789","x=0 and y=0","36",
            "x = -4 or x = -5","264 units"};

    String calculationoption3[] = {"Both 1 and 2","12222","100","0","3146","400","12","100",
            "177","25","6666","484","1234321","6","1023456789","9876543210","x=6 and y=0",
            "12","x = 0 or x = ±3","308 units cube"};

    String calculationoption4[] = {"none","36","0","√2","3156","360","14884","10","169",
            "±15","3696","198","12344321","0","9876543210","0987654321","x=5 and y=-2","30",
            "x = 1 or x = 8","264 units cube"};

    int calculationanswer[] = {2,1,3,3,4,4,1,2,2,4,2,1,3,3,4,2,4,1,1,3};

    int randomquestion[] =  new int[10];   

    static void main()throws IOException
    {
        newquiz ob = new newquiz();
        ob.instructions();
        ob.startquiz();
        ob.performance();
    }

    void instructions()throws IOException
    { 
        System.out.print("\n\n\n\t\t\tEnter Your name before you start the game\n\n\t\t\t======> ");        
        name = in.readLine(); 
        Thanks = "Thank You "+name;
        y = Thanks.length();
        System.out.println("\u000c");
        System.out.println("\n\n\n\t\t\t\t\tWelcome To Science and Maths Quiz");
        System.out.println("\n\t\t\t\t\t      Instructions");
        System.out.println("\n1)You have 4 subjects and a mental calculation test.");
        System.out.println("\n2)You can attempt any one subject at a time"); 
        System.out.println("\n3)Each subject will have 10 Questions");
        System.out.println("\n4)Each Question will have 4 options\n");       
        System.out.println("5)You have to enter one option: 1,2,3 or 4 and press enter");    
        System.out.println("\n6)Each question carries 2 marks");
        System.out.println("\n7)You will get 2 marks for a right answer");        
        System.out.println("\n8)There is no negative marking for a wrong answer\n\n\n");
    }

    void startquiz()throws IOException
    {
        for(i=0;i<10;i++)
        { 
            int n = (int)(Math.rint(Math.random()*19));
            flag = false;
            for(z=0;z<10;z++)
            { 
                if(randomquestion[z]==n)
                { 
                    flag = true;
                    i=i-1;
                    break;
                }
            }

            if(flag==false)
            { 
                randomquestion[i] = n;
            }
        }

        System.out.println("Enter any number to continue.");

        while(true)
        {
            try
            {                        
                continuequiz = Integer.parseInt(in.readLine());
            }

            catch(NumberFormatException ex)
            {
                System.out.println(ex);
                System.out.println("\nEnter an integer");
                continue;
            }

            for(l=0;l<=9999999;l++)
            {
            }

            System.out.println("\u000c");
            System.out.println("\n\n\t\t\t\tPlease Wait");

            for(l=0;l<=9999999;l++)
            {
            }

            do 
            {
                System.out.println("\u000c");
                System.out.println("\n\n\n\t\t\t1)Maths Quiz\n");
                System.out.println("\t\t\t2)Physics Quiz\n");
                System.out.println("\t\t\t3)Chemistry Quiz\n");
                System.out.println("\t\t\t4)Biology Quiz\n");
                System.out.println("\t\t\t5)Mental Calculation Test\n");
                System.out.println("\t\t\t6)Exit");
                System.out.println("\n\n\nEnter the option number which you want");

                do
                {
                    while(true)
                    {
                        try
                        {                        
                            selectsubject = Integer.parseInt(in.readLine());
                        }

                        catch(NumberFormatException ex)
                        {
                            System.out.println(ex);
                            System.out.println("\nEnter 1,2,3,4,5 or 6");
                            continue;
                        }

                        if(selectsubject==1)
                        {                        
                            System.out.println("\n\t\t\t\tBest Of Luck "+name+"\n\n");
                            System.out.println("\t\t\t\tPLEASE WAIT\n\n");

                            for(l=0;l<=75000000;l++)
                            {
                                if(l%1000000==0)
                                {
                                    System.out.print(".");
                                }
                            }

                            System.out.println("\u000c");

                            for(i=0;i<10;i++)
                            {                            
                                System.out.println("\n\t\t"+(i+1)+")"+maths[randomquestion[i]]);
                                System.out.println("\n\n\t\t1)"+mathoption1[randomquestion[i]]);
                                System.out.println("\n\t\t2)"+mathoption2[randomquestion[i]]);
                                System.out.println("\n\t\t3)"+mathoption3[randomquestion[i]]);
                                System.out.println("\n\t\t4)"+mathoption4[randomquestion[i]]); 
                                System.out.println("\nEnter your answer option\n");
                                while(true)
                                {
                                    do
                                    {

                                        try
                                        {                        
                                            answer[i] = Integer.parseInt(in.readLine());
                                        }

                                        catch(NumberFormatException ex)
                                        {
                                            System.out.println(ex);
                                            System.out.println("\nEnter 1,2,3 or 4");
                                            continue;
                                        }

                                        if(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4)
                                        {  
                                            System.out.println("\nYou have to enter 1,2,3 or 4!!!");                                                                                  
                                        }
                                    }
                                    while(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4);

                                    if(answer[i]==mathanswer[randomquestion[i]])
                                    {
                                        System.out.println("\n"+name+" your answer is right!");                         
                                        System.out.println("\nYou get two marks for this question");
                                        marks = marks+2;                       
                                        System.out.println("\n\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=99999999;l++)
                                        {
                                        }

                                        System.out.println("\u000c");
                                    }

                                    else
                                    {
                                        System.out.println("\nSorry "+name+" your answer is wrong");
                                        System.out.println("\nRight option is "+mathanswer[i]);
                                        System.out.println("\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=9999999;l++)
                                        {
                                        }
                                        System.out.println("\u000c");
                                    }

                                    break;
                                }
                            }
                        }

                        if(selectsubject==2)
                        { 
                            System.out.println("\n\t\t\t\tBest Of Luck "+name+"\n\n");
                            System.out.println("\t\t\t\tPLEASE WAIT \n\n");

                            for(l=0;l<=75000000;l++)
                            {
                                if(l%1000000==0)
                                {
                                    System.out.print(".");
                                }
                            }

                            System.out.println("\u000c");

                            for(i=0;i<10;i++)
                            {                            
                                System.out.println("\n\t\t"+(i+1)+")"+physics[randomquestion[i]]);
                                System.out.println("\n\n\t\t1)"+physicsoption1[randomquestion[i]]);
                                System.out.println("\n\t\t2)"+physicsoption2[randomquestion[i]]);
                                System.out.println("\n\t\t3)"+physicsoption3[randomquestion[i]]);
                                System.out.println("\n\t\t4)"+physicsoption4[randomquestion[i]]); 
                                System.out.println("\nEnter your answer option\n");
                                while(true)
                                {
                                    do
                                    {

                                        try
                                        {                        
                                            answer[i] = Integer.parseInt(in.readLine());
                                        }

                                        catch(NumberFormatException ex)
                                        {
                                            System.out.println(ex);
                                            System.out.println("\nEnter 1,2,3 or 4");
                                            continue;
                                        }

                                        if(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4)
                                        {  
                                            System.out.println("\nYou have to enter 1,2,3 or 4!!!");                                                                                  
                                        }
                                    }
                                    while(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4);

                                    if(answer[i]==physicsanswer[randomquestion[i]])
                                    {
                                        System.out.println("\n"+name+" your answer is right!");                         
                                        System.out.println("\nYou get two marks for this question");
                                        marks = marks+2;                       
                                        System.out.println("\n\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=99999999;l++)
                                        {
                                        }

                                        System.out.println("\u000c");
                                    }

                                    else
                                    {
                                        System.out.println("\nSorry "+name+" your answer is wrong");
                                        System.out.println("\nRight option is "+physicsanswer[randomquestion[i]]);
                                        System.out.println("\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=9999999;l++)
                                        {
                                        }
                                        System.out.println("\u000c");
                                    }

                                    break;
                                }
                            }
                        }

                        if(selectsubject==3)
                        { 
                            System.out.println("\n\t\t\t\tBest Of Luck "+name+"\n\n");
                            System.out.println("\t\t\t\tPLEASE WAIT\n\n");

                            for(l=0;l<=75000000;l++)
                            {
                                if(l%1000000==0)
                                {
                                    System.out.print(".");
                                }
                            }

                            System.out.println("\u000c");

                            for(i=0;i<10;i++)
                            {                            
                                System.out.println("\n\t\t"+(i+1)+")"+chemistry[randomquestion[i]]);
                                System.out.println("\n\n\t\t1)"+chemistryoption1[randomquestion[i]]);
                                System.out.println("\n\t\t2)"+chemistryoption2[randomquestion[i]]);
                                System.out.println("\n\t\t3)"+chemistryoption3[randomquestion[i]]);
                                System.out.println("\n\t\t4)"+chemistryoption4[randomquestion[i]]); 
                                System.out.println("\nEnter your answer option\n");
                                while(true)
                                {
                                    do
                                    {

                                        try
                                        {                        
                                            answer[i] = Integer.parseInt(in.readLine());
                                        }

                                        catch(NumberFormatException ex)
                                        {
                                            System.out.println(ex);
                                            System.out.println("\nEnter 1,2,3 or 4");
                                            continue;
                                        }

                                        if(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4)
                                        {  
                                            System.out.println("\nYou have to enter 1,2,3 or 4!!!");                                                                                  
                                        }
                                    }
                                    while(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4);

                                    if(answer[i]==chemistryanswer[randomquestion[i]])
                                    {
                                        System.out.println("\n"+name+" your answer is right!");                         
                                        System.out.println("\nYou get two marks for this question");
                                        marks = marks+2;                       
                                        System.out.println("\n\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=99999999;l++)
                                        {
                                        }

                                        System.out.println("\u000c");
                                    }

                                    else
                                    {
                                        System.out.println("\nSorry "+name+" your answer is wrong");
                                        System.out.println("\nRight option is "+chemistryanswer[randomquestion[i]]);
                                        System.out.println("\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=9999999;l++)
                                        {
                                        }
                                        System.out.println("\u000c");
                                    }

                                    break;
                                }
                            }
                        }

                        if(selectsubject==4)
                        {
                            System.out.println("\n\t\t\t\tBest Of Luck "+name+"\n\n");
                            System.out.println("\t\t\t\tPLEASE WAIT\n\n");

                            for(l=0;l<=750000000;l++)
                            {
                                if(l%10000000==0)
                                {
                                    System.out.print(".");
                                }
                            }

                            System.out.println("\u000c");

                            for(i=0;i<10;i++)
                            {                            
                                System.out.println("\n\t\t"+(i+1)+")"+biology[randomquestion[i]]);
                                System.out.println("\n\n\t\t1)"+biologyoption1[randomquestion[i]]);
                                System.out.println("\n\t\t2)"+biologyoption2[randomquestion[i]]);
                                System.out.println("\n\t\t3)"+biologyoption3[randomquestion[i]]);
                                System.out.println("\n\t\t4)"+biologyoption4[randomquestion[i]]); 
                                System.out.println("\nEnter your answer option\n");
                                while(true)
                                {
                                    do
                                    {

                                        try
                                        {                        
                                            answer[i] = Integer.parseInt(in.readLine());
                                        }

                                        catch(NumberFormatException ex)
                                        {
                                            System.out.println(ex);
                                            System.out.println("\nEnter 1,2,3 or 4");
                                            continue;
                                        }
                                        if(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4)
                                        {  
                                            System.out.println("\nYou have to enter 1,2,3 or 4!!!");                                                                                  
                                        }
                                    }
                                    while(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4);

                                    if(answer[i]==biologyanswer[randomquestion[i]])
                                    {
                                        System.out.println("\n"+name+" your answer is right!");                         
                                        System.out.println("\nYou get two marks for this question");
                                        marks = marks+2;                       
                                        System.out.println("\n\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        System.out.println("\u000c");
                                    }

                                    else
                                    {
                                        System.out.println("\nSorry "+name+" your answer is wrong");
                                        System.out.println("\nRight option is "+biologyanswer[randomquestion[i]]);
                                        System.out.println("\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }
                                        System.out.println("\u000c");
                                    }

                                    break;
                                }
                            }
                        }

                        if(selectsubject==5)
                        { 
                            System.out.println("\n\t\t\t\tBest Of Luck "+name+"\n\n");
                            System.out.println("\t\t\t\tPLEASE WAIT\n\n");

                            for(l=0;l<=750000000;l++)
                            {
                                if(l%10000000==0)
                                {
                                    System.out.print(".");
                                }
                            }

                            System.out.println("\u000c");

                            for(i=0;i<10;i++)
                            {                            
                                System.out.println("\n\t\t"+(i+1)+")"+calculation[randomquestion[i]]);
                                System.out.println("\n\n\t\t1)"+calculationoption1[randomquestion[i]]);
                                System.out.println("\n\t\t2)"+calculationoption2[randomquestion[i]]);
                                System.out.println("\n\t\t3)"+calculationoption3[randomquestion[i]]);
                                System.out.println("\n\t\t4)"+calculationoption4[randomquestion[i]]); 
                                System.out.println("\nEnter your answer option\n");
                                while(true)
                                {
                                    do
                                    {

                                        try
                                        {                        
                                            answer[i] = Integer.parseInt(in.readLine());
                                        }

                                        catch(NumberFormatException ex)
                                        {
                                            System.out.println(ex);
                                            System.out.println("\nEnter 1,2,3 or 4");
                                            continue;
                                        }
                                        if(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4)
                                        {  
                                            System.out.println("\nYou have to enter 1,2,3 or 4!!!");                                                                                  
                                        }
                                    }
                                    while(answer[i]!=1&&answer[i]!=2&&answer[i]!=3&&answer[i]!=4);

                                    if(answer[i]==calculationanswer[randomquestion[i]])
                                    {
                                        System.out.println("\n"+name+" your answer is right!");                         
                                        System.out.println("\nYou get two marks for this question");
                                        marks = marks+2;                       
                                        System.out.println("\n\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        System.out.println("\u000c");
                                    }

                                    else
                                    {
                                        System.out.println("\nSorry "+name+" your answer is wrong");
                                        System.out.println("\nRight option is "+calculationanswer[randomquestion[i]]);
                                        System.out.println("\n\t\t\t\t\tYour total marks are "+marks);

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }

                                        for(l=0;l<=999999999;l++)
                                        {
                                        }
                                        System.out.println("\u000c");
                                    }

                                    break;
                                }
                            }
                        }

                        if(selectsubject==6)
                        { 
                            System.out.println("Are You Sure You Want To Exit?\n");
                            System.out.println("Enter 0 to continue or any other number to exit");
                            while(true)
                            {
                                try
                                {                        
                                    exit = Integer.parseInt(in.readLine());
                                }

                                catch(NumberFormatException ex)
                                {
                                    System.out.println(ex);
                                    System.out.println("\nEnter 0 to continue or any other number to exit");
                                    continue;
                                } 

                                if(exit==0)
                                {
                                    break;
                                }

                                if(exit!=0)
                                {
                                    System.out.println("\n\n");                        

                                    for(i=0;i<y;i++)
                                    {
                                        System.out.print(Thanks.charAt(i)); 

                                        for(l=0;l<=99999999;l++)
                                        {
                                        }
                                    }        
                                    System.out.println("\u000c");
                                    System.out.println("\n\n\n\n\n\t\t\tCreated by Eashan Mundhe");
                                    for(i=0;i<99999999;i++)
                                    {
                                    }
                                    System.exit(0);
                                    break;
                                }
                                break;
                            }                           
                        }  

                        if(selectsubject!=1&&selectsubject!=2&&selectsubject!=3&&selectsubject!=4&&
                        selectsubject!=5&&selectsubject!=6)
                        {
                            System.out.println("Enter 1,2,3,4,5 or 6 only!");
                        }
                        break;
                    }                    
                }
                while(selectsubject!=1&&selectsubject!=2&&selectsubject!=3&&selectsubject!=4&&
                selectsubject!=5&&selectsubject!=6);
            }   
            while(exit==0);
            System.out.println("\u000c");
            break;
        }
    }

    void performance()throws IOException
    {        
        percent =(marks*100)/20;        
        System.out.println("\u000c");
        System.out.println("\n\t\t\tEnter 1 if you want your marksheet\n\n");
        System.out.println("\t\t\tEnter 2 if you want marks with solution");

        if(selectsubject==1)
        { 
            subject = "Maths";
        }

        if(selectsubject==2)
        {
            subject = "Physics";
        }

        if(selectsubject==3)
        {
            subject = "Chemistry";
        }

        if(selectsubject==4)
        { 
            subject = "Biology";
        }

        if(selectsubject==5)
        {
            subject = "Mental Calculations";
        }

        do
        {
            while(true)
            {                
                try
                {                 
                    result = Integer.parseInt(in.readLine());
                }

                catch(NumberFormatException e)
                { 
                    System.out.println(e);
                    System.out.println("Enter 1 or 2 only");
                    for(l=0;l<=999999999;l++)
                    {
                    }
                    for(l=0;l<=999999999;l++)
                    {
                    }
                    continue;
                }            

                if(result==1)
                { 
                    System.out.println("\n\t\t\t\t\tLOADING YOUR REPORT CARD");
                    for(l=0;l<=75000000;l++)
                    {
                        if(l%1000000==0)
                        {
                            System.out.print(".");
                        }
                    }
                    System.out.println("\u000c");
                    System.out.println("\n\n\nYour total marks are "+marks+" /20");
                    System.out.println("\n\nYour percentage is "+percent+".\n\n");

                    if(percent<40)
                    {
                        System.out.println(name+" you are weak in "+subject+".\n\n\n");
                    }

                    if(percent>=40&&percent<=49)
                    {
                        System.out.println(name+" you have to practise "+subject+" regularly.\n\n\n");
                    }

                    if(percent>=50&&percent<=64)
                    { 
                        System.out.println(name+" you can improve yourself in "+subject+".\n\n\n");
                    }

                    if(percent>=65&&percent<=79)
                    {
                        System.out.println(name+" you are good in "+subject+".\n\n\n");
                    }

                    if(percent>=80&&percent<=89)
                    {
                        System.out.println(name+" you are very good in "+subject+".\n\n\n");
                    }

                    if(percent>=90&&percent<=100)
                    {
                        System.out.println(name+" you are perfect in "+subject+".\n\n\n");
                    }

                    for(l=0;l<=999999999;l++)
                    {
                    } 

                    System.out.println("\n\n\t\t\t\t");
                    for(i=0;i<y;i++)
                    {
                        System.out.print(Thanks.charAt(i));

                        for(l=0;l<=99999999;l++)
                        {
                        }
                    }  

                    System.out.println("\n\n\n\n\n\t\t\tCreated by Eashan Mundhe");
                    for(i=0;i<99999999;i++)
                    {
                    }
                    System.exit(0);
                }

                if(result==2)
                {
                    System.out.println("\n\t\t\t\t\tLOADING YOUR REPORT CARD");
                    for(l=0;l<=75000000;l++)
                    {
                        if(l%1000000==0)
                        {
                            System.out.print(".");
                        }
                    }
                    System.out.println("\u000c");
                    if(selectsubject==1)
                    {
                        System.out.println("\n\n\n\t\t\t\t\tYou attempted Maths Quiz");                        
                        if(result==2)
                        {
                            for(i=0;i<10;i++)
                            {
                                System.out.println("\n\t\t\t"+(i+1)+")"+maths[randomquestion[i]]);
                                System.out.println("\n\n\t\t\t1)"+mathoption1[randomquestion[i]]);
                                System.out.println("\n\t\t\t2)"+mathoption2[randomquestion[i]]);
                                System.out.println("\n\t\t\t3)"+mathoption3[randomquestion[i]]);
                                System.out.println("\n\t\t\t4)"+mathoption4[randomquestion[i]]);
                                System.out.println("\n\t\t\t Your Answer Option "+answer[i]);
                                System.out.println("\n\t\t\t Correct answer Option "+mathanswer[randomquestion[i]]);                
                            }
                        }
                    }

                    if(selectsubject==2)
                    {
                        System.out.println("\n\n\n\t\t\t\t\tYou attempted Physics Quiz");                        
                        if(result==2)
                        {
                            for(i=0;i<10;i++)
                            {
                                System.out.println("\n\t\t\t"+(i+1)+")"+physics[randomquestion[i]]);
                                System.out.println("\n\n\t\t\t1)"+physicsoption1[randomquestion[i]]);
                                System.out.println("\n\t\t\t2)"+physicsoption2[randomquestion[i]]);
                                System.out.println("\n\t\t\t3)"+physicsoption3[randomquestion[i]]);
                                System.out.println("\n\t\t\t4)"+physicsoption4[randomquestion[i]]);
                                System.out.println("\n\t\t\t Your Answer Option "+answer[i]);
                                System.out.println("\n\t\t\t Correct answer Option "+physicsanswer[randomquestion[i]]);                
                            }
                        }
                    }

                    if(selectsubject==3)
                    {
                        System.out.println("\n\n\n\t\t\t\t\tYou attempted Chemistry Quiz");                        
                        if(result==2)
                        {
                            for(i=0;i<10;i++)
                            {
                                System.out.println("\n\t\t\t"+(i+1)+")"+chemistry[randomquestion[i]]);
                                System.out.println("\n\n\t\t\t1)"+chemistryoption1[randomquestion[i]]);
                                System.out.println("\n\t\t\t2)"+chemistryoption2[randomquestion[i]]);
                                System.out.println("\n\t\t\t3)"+chemistryoption3[randomquestion[i]]);
                                System.out.println("\n\t\t\t4)"+chemistryoption4[randomquestion[i]]);
                                System.out.println("\n\t\t\t Your Answer Option "+answer[i]);
                                System.out.println("\n\t\t\t Correct answer Option "+chemistryanswer[randomquestion[i]]);                
                            }
                        }
                    }

                    if(selectsubject==4)
                    {
                        System.out.println("\n\n\n\t\t\t\t\tYou attempted Biology Quiz");                        
                        if(result==2)
                        {
                            for(i=0;i<10;i++)
                            {
                                System.out.println("\n\t\t\t"+(i+1)+")"+biology[randomquestion[i]]);
                                System.out.println("\n\n\t\t\t1)"+biologyoption1[randomquestion[i]]);
                                System.out.println("\n\t\t\t2)"+biologyoption2[randomquestion[i]]);
                                System.out.println("\n\t\t\t3)"+biologyoption3[randomquestion[i]]);
                                System.out.println("\n\t\t\t4)"+biologyoption4[randomquestion[i]]);
                                System.out.println("\n\t\t\t Your Answer Option "+answer[i]);
                                System.out.println("\n\t\t\t Correct answer Option "+biologyanswer[randomquestion[i]]);                
                            }
                        }
                    }

                    if(selectsubject==5)
                    { 
                        System.out.println("\n\n\n\t\t\t\t\tYou attempted Mental Calculation Test");                        
                        if(result==2)
                        {
                            for(i=0;i<10;i++)
                            {
                                System.out.println("\n\t\t\t"+(i+1)+")"+calculation[randomquestion[i]]);
                                System.out.println("\n\n\t\t\t1)"+calculationoption1[randomquestion[i]]);
                                System.out.println("\n\t\t\t2)"+calculationoption2[randomquestion[i]]);
                                System.out.println("\n\t\t\t3)"+calculationoption3[randomquestion[i]]);
                                System.out.println("\n\t\t\t4)"+calculationoption4[randomquestion[i]]);
                                System.out.println("\n\t\t\t Your Answer Option "+answer[i]);
                                System.out.println("\n\t\t\t Correct answer Option "+calculationanswer[randomquestion[i]]);                
                            }
                        }
                    }

                    System.out.println("\n\n\nYour total marks are "+marks+" /20");
                    System.out.println("\n\nYour percentage is "+percent+".\n\n");

                    if(percent<40)
                    {
                        System.out.println(name+" you are weak in "+subject+".\n\n\n");
                    }

                    if(percent>=40&&percent<=49)
                    {
                        System.out.println(name+" you have to practise "+subject+" regularly.\n\n\n");
                    }

                    if(percent>=50&&percent<=64)
                    { 
                        System.out.println(name+" you can improve yourself in "+subject+".\n\n\n");
                    }

                    if(percent>=65&&percent<=79)
                    {
                        System.out.println(name+" you are good in "+subject+".\n\n\n");
                    }

                    if(percent>=80&&percent<=89)
                    {
                        System.out.println(name+" you are very good in "+subject+".\n\n\n");
                    }

                    if(percent>=90&&percent<=100)
                    {
                        System.out.println(name+" you are perfect in "+subject+".\n\n\n");
                    }         

                    System.out.println("\n\n\n\n\n\t\t\tCreated by Eashan Mundhe");
                    for(i=0;i<99999999;i++)
                    {
                    }
                }

                if(result!=1&&result!=2)
                { 
                    System.out.println("\nEnter 1 or 2 only");
                }  
                break;
            }
        }
        while(result!=1&&result!=2);
    }
}
