package genetic;
import java.util.ArrayList;
class Thought19 extends Thought{
private static ArrayList<Thought19> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 982.157570089888;
private double fd1 = 859.2933321657771;
private Thought fo0 = null;
private Thought fo1 = null;
Thought19 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought19 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought19 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 *= -1;
    Thought lo1 = Thought83.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    Output.points[7][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought46.getInstance(fd1, fd0, fd1, fd0);
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = fd1 > fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = !ab2;
    Output.points[8][0] += fd1;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought54.getInstance();
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
        fd1 = fd0 + fd1;
        Thought lo2 = Thought41.getInstance(fd0, fd1, fd0, fd1);
        double ld3 = 840.9388257748905;
        Thought lo4 = Thought42.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3);
        ab3 = fd0 < fd1;
        ab4 = ld3 < fd0;
        fd1 *= -1;
        fb0 = fb1 || lb1;
        ld3 *= -1;
        ab1 = fd0 > fd1;
        Output.points[8][1] += ld3;
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    double ld0 = 103.4669004039343;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[8][2] -= ad2;
    Thought lo1 = Thought61.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld0 *= -1;
    fb0 = ad1 < ad2;
    boolean lb2 = false;
    boolean lb3 = true;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(lb3, fb0, fb1, lb2);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
          lb3 = fo1.m2();
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb1, lb2, lb3, fb0);
}
    fb1 = lb2 || lb3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    double ld0 = 68.41674785604135;
    boolean lb1 = true;
    double ld2 = 755.0198320094581;
    Thought lo3 = Thought59.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    Output.points[8][3] -= ad2;
    fb0 = ad3 > ad4;
    Thought lo4 = Thought57.getInstance(fd0, fd1, ld0, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb1, ab1, ab2);
}
    ab3 = fd1 > ld0;
    if (ab4) {
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo5 = Thought32.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
        lb1 = !ab1;
        Thought lo6 = Thought91.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        Output.points[8][4] += ld2;
        Output.points[8][5] -= ad1;
        fb1 = ad2 > ad3;
        boolean lb7 = false;
        if (lb7) {
            boolean lb8 = true;
            Output.points[8][6] += ad4;
if(fo0 != null){
              fd0 = fo0.m3(fd1, ld0, ld2, ad1);
}
            ad2 = ad3 - ad4;
            boolean lb9 = true;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    double ld0 = 637.0859797944959;
    if (fb1) {
        Thought lo1 = Thought55.getInstance(fb0, fb1, fb0, fb1);
        fd0 = fd1 - ld0;
if(ao2 != null){
          ao2.m1();
}
        fd0 = fd1 + ld0;
        fd0 = fd1 - ld0;
        Thought lo2 = Thought29.getInstance(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
        Thought lo3 = Thought94.getInstance(ao3, ao4, fo0, fo1);
        for(int i0=0; i0<10; i0++){
            fd1 *= -1;
            Output.points[8][7] -= ld0;
            fd0 = fd1 - ld0;
            double ld4 = 993.8445280823738;
if(ao1 != null){
              fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
              ld0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Output.points[8][8] += ad1;
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    double ld0 = 635.3086731595643;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought36.getInstance(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fb0 = fb1 && lb2;
        ld0 *= -1;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
}
        fb1 = ad1 > ad2;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        Output.points[0][0] += ld0;
        if (lb2) {
            fb0 = fb1 && lb2;
if(fo0 != null){
              ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
            boolean lb3 = false;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought0.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - fd0;
    Output.points[0][1] += fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb2, lb3, ab1, ab2);
}
    boolean lb4 = false;
    double ld5 = 811.1922431363502;
if(fo0 != null){
      ao4 = fo0.m4(ld5, fd0, fd1, ld5);
}
    Thought lo6 = Thought50.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld5, fd0);
    Thought lo7 = Thought68.getInstance(ab2, ab3, ab4, fb0);
    Thought lo8 = Thought96.getInstance();

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought59.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = false;
        ab4 = fd0 > fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb2, ab1, ab2);
}
    fd0 = fd1 + ad1;
    Thought lo3 = Thought68.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      lb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    lb2 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    boolean lb4 = false;
    lb0 = ad4 < fd0;
    lb2 = lb4 && ab1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb2);
}
    fd1 = ad1 - ad2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought74.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        Thought lo1 = Thought58.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    boolean lb3 = true;
    lb3 = fd0 < fd1;
        fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m1(lb3, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought22.getInstance();
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = lb1 || ab1;
    ab2 = !ab3;
    Thought lo2 = Thought72.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = true;
    ab3 = fd1 > fd0;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought18.getInstance();
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    double ld2 = 558.8002832712324;
    double ld3 = 883.1643146965081;
    double ld4 = 277.4728418568904;
    Output.points[0][2] -= ad1;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ad1 > ad2;
    double ld1 = 994.9305902789889;
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    ad3 *= -1;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought38.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    double ld2 = 84.50639081200083;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld2, fd0);
}
        fd1 = ld2 + fd0;
    Output.points[0][3] += fd1;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought7.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    if (fb0) {
        fb1 = fd0 < fd1;
if(fo1 != null){
          fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        ad1 = ad2 - ad3;
        fb0 = ad4 > fd0;
if(ao1 != null){
          ao1.m1();
}
        Output.points[0][4] -= fd1;
        boolean lb2 = true;
        ad1 = ad2 - ad3;
if(ao2 != null){
          ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
        boolean lb3 = false;
if(ao3 != null){
          lb3 = ao3.m2(ao4, fo0, fo1, ao1);
}
        fb0 = ad3 < ad4;
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb1, lb2, lb3, fb0);
}
        fb1 = ad3 > ad4;
        lb1 = lb2 || lb3;
        fd0 = fd1 + ad1;
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        lb3 = fb0 && fb1;
        fd0 = fd1 + ad1;
        boolean lb4 = false;
        ad2 = ad3 + ad4;
        Output.points[0][5] += fd0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
        fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought24.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    Output.points[0][6] += fd1;
        fd0 = fd1 + fd0;
    boolean lb4 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb5 = false;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    lb2 = lb4 && lb5;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3();
}
    Output.points[0][7] += ad3;
    Output.points[0][8] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 - fd0;
    double ld0 = 180.0587726003971;
    double ld1 = 629.0102172662639;
    Thought lo2 = Thought11.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ld1 = ad1 - ad2;
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[1][0] -= ld0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ld0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ld1 = ao3.m3();
}
    ad1 *= -1;
if(ao4 != null){
      ao4.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld3 = 174.45198834761658;
    fd0 = fd1 - ld0;
    ab2 = ld1 > ld3;
    boolean lb4 = false;
    Thought lo5 = Thought58.getInstance(fo0, fo1, ao1, ao2);
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 > fd1;
        fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
        fb0 = fd0 > fd1;
        boolean lb0 = true;
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 525.2321587284661;
    fd0 = fd1 + ld0;
    double ld1 = 291.4030749081081;
    ab1 = ld1 < fd0;
    ab2 = fd1 > ld0;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    ad4 *= -1;
    fd0 *= -1;
    Thought lo0 = Thought71.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld1 = 883.8485574696774;
    fb1 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought13.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    double ld1 = 608.002667747601;
    ld1 = ad1 - ad2;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
    Output.points[1][1] -= ld1;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought3.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    boolean lb3 = false;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][2] -= fd1;
    Output.points[1][3] -= fd0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 298.0011689767431;
    fb1 = fd0 < fd1;
    fb0 = ld0 < fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    double ld0 = 211.16860738906806;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 + ld0;
    boolean lb1 = true;
    lb1 = !fb0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb1 = fd0 > fd1;
    boolean lb2 = false;
    Thought lo3 = Thought71.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
    Output.points[1][4] += fd0;
    ab2 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 442.5036640811119;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    ld0 = fd0 - fd1;
    boolean lb1 = false;
    Thought lo2 = Thought92.getInstance(ab4, fb0, fb1, lb1);
    for(int i0=0; i0<10; i0++){
        if (ab1) {
            Thought lo3 = Thought4.getInstance();
            ab2 = !ab3;
            ld0 *= -1;
            boolean lb4 = false;
if(ao1 != null){
              ao1.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
            Thought lo5 = Thought16.getInstance(ao2, ao3, ao4, fo0);
            Thought lo6 = Thought48.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, lb4, lb1, ab1, ab2);
}}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = fd1 > ad1;
    fb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought50.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao4.m3(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    double ld2 = 501.51473561044065;
    boolean lb3 = true;
    Thought lo4 = Thought9.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
    if (lb3) {
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, lb1, lb3);
}
        fb0 = fb1 || lb0;
        fd0 *= -1;
        fd1 *= -1;
        ld2 = fd0 - fd1;
        lb1 = ld2 < fd0;
        fd1 = ld2 + fd0;
        lb3 = !fb0;
        fd1 = ld2 + fd0;
        if (fb1) {
            fd1 *= -1;
            ld2 *= -1;
if(fo1 != null){
              fd0 = fo1.m3();
}
if(fo0 != null){
              fo0.m3(fd1, ld2, fd0, fd1, lb0, lb1, lb3, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            boolean lb5 = false;
            fb0 = fb1 && lb5;
            double ld6 = 919.0505711968751;
            ld6 = ld2 + fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld6, ld2, fd0, lb0, lb1, lb3, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb5, lb0, lb1);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 777.6967228895865;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought84.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 - ld0;
    boolean lb2 = false;
    boolean lb3 = true;
    fd0 *= -1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][5] -= ad2;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought49.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ad1 < ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought34.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
    double ld3 = 143.57434045874177;
    ad3 *= -1;
    boolean lb4 = false;
    Thought lo5 = Thought11.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3);
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb4, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
    double ld6 = 362.8370153421362;
    lb1 = ad1 < ad2;
    boolean lb7 = true;
    boolean lb8 = true;
    lb4 = !lb7;
    lb8 = ad3 > ad4;
    fd0 = fd1 - ld3;
    boolean lb9 = true;
if(fo1 != null){
      ld6 = fo1.m3(ad1, ad2, ad3, ad4, lb9, fb0, fb1, lb1);
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought18.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ad1 *= -1;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[1][6] += fd1;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = fb0 || fb1;
    lb0 = lb1 || lb2;
        fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 479.4202001001898;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    if (fb0) {
        Thought lo1 = Thought28.getInstance(ad4, fd0, fd1, ld0);
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
        fb0 = fb1 || fb0;
        fd0 *= -1;
        double ld2 = 247.45265216043452;
        fb1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        boolean lb3 = false;
        boolean lb4 = false;
if(ao1 != null){
          ld2 = ao1.m3();
}
        lb3 = ld0 < ad1;
        boolean lb5 = false;
if(ao2 != null){
          ao2.m1(ad2, ad3, ad4, fd0, lb4, lb5, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, ld0, ad1, ad2, lb3, lb4, lb5, fb0);
}
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    Output.points[1][7] -= fd1;
    Thought lo2 = Thought25.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    lb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      lb1 = ao1.m2();
}
    fd1 = fd0 - fd1;
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][8] += ad1;
if(ao1 != null){
      ab1 = ao1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought34.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = false;
    double ld2 = 644.553183773511;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    double ld3 = 954.9108179169405;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao4.m2(fd1, ld2, ld3, ad1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        Output.points[2][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought95.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 97.82171294184992;
    fd0 = fd1 + ld2;
    boolean lb3 = false;
    fd0 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, lb3, lb4, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, ld2, fd0, fd1);
}
    double ld5 = 919.5335779584454;
    fb1 = lb1 && lb3;
    Thought lo6 = Thought13.getInstance(fo1, fo0, fo1, fo0, ld2, ld5, fd0, fd1);
    Output.points[2][1] -= ld2;
    lb4 = ld5 > fd0;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 402.87117422330635;
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2();
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    double ld3 = 463.47562074209037;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
    Output.points[2][2] -= fd0;
    fd1 = ld0 + ld3;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3);
}
    Thought lo4 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought30.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb2 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
