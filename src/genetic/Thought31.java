package genetic;
import java.util.ArrayList;
class Thought31 extends Thought{
private static ArrayList<Thought31> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 602.6019581736082;
private double fd1 = 955.0457858219645;
private Thought fo0 = null;
private Thought fo1 = null;
Thought31 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought31 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought31 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 913.8407608464347;
    Thought lo1 = Thought57.getInstance();
    fb1 = fb0 || fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought70.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = true;
    lb3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, lb3, fb0);
}
    double ld4 = 757.8166539361835;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb3, fb0, fb1);
}
    Output.points[2][8] -= ld4;
    boolean lb5 = false;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld4);
}
        fd0 = fd1 - ld0;
if(fo1 != null){
      lb3 = fo1.m2(lb5, lb6, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = !ab2;
    Output.points[3][0] += fd1;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought58.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought65.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fb1 && ab1;
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
    for(int i0=0; i0<10; i0++){
        Output.points[3][1] -= ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        double ld0 = 72.63369705154281;
        Thought lo1 = Thought89.getInstance(fb1, fb0, fb1, fb0);
        ld0 = ad1 - ad2;
if(fo1 != null){
          ad3 = fo1.m3();
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        boolean lb2 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
        ad1 = ad2 + ad3;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ld0);
}
        Thought lo3 = Thought76.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
          fd0 = fo0.m3(lb2, fb0, fb1, lb2);
}
        fb0 = !fb1;
        Output.points[3][2] += fd1;
        boolean lb4 = false;
        lb2 = lb4 && fb0;
        double ld5 = 628.8988382647364;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(ld0, ld5, ad1, ad2, fb1, lb2, lb4, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
    ad4 = fd0 - fd1;
    boolean lb1 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = ad2 > ad3;
    ab1 = ab2 || ab3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    ab4 = ad4 > fd0;

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
    fb0 = fb1 && fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[3][3] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fd1 < fd0;
    if (fb0) {
        boolean lb1 = true;
        fb0 = fb1 && lb1;
        lb0 = fb0 || fb1;
        double ld2 = 60.230404636181824;
        boolean lb3 = true;
        lb1 = lb3 && lb0;
        for(int i0=0; i0<10; i0++){
            fb0 = fd0 < fd1;
            fb1 = ld2 < fd0;
            double ld4 = 552.8279452054809;
            double ld5 = 602.728343250789;
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    ad2 = ad3 - ad4;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought73.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought23.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > fd0;
if(fo0 != null){
          ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought30.getInstance(fo1, ao1, ao2, ao3);
        fb0 = !fb1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
        fb0 = fb1 || ab1;
        Thought lo2 = Thought61.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
        fd0 = fd1 - fd0;
        fb1 = ab1 || ab2;
        boolean lb3 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    if (lb0) {
if(fo0 != null){
          fo0.m3();
}
        ab1 = !ab2;
        if (ab3) {
            ad1 = ad2 + ad3;
            ad4 *= -1;
            ab4 = fd0 < fd1;
            boolean lb1 = false;
            ab4 = fb0 && fb1;
            boolean lb2 = true;
            Output.points[3][5] += ad1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought86.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought99.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    Output.points[3][6] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought42.getInstance(fo1, fo0, fo1, fo0);
        fd0 *= -1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        boolean lb2 = true;
        double ld3 = 423.97429310073477;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, lb0);
}
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        if (fb1) {
            fd0 = fd1 + ld3;
            fd0 *= -1;
if(fo1 != null){
              fd1 = fo1.m3();
}
            lb2 = ld3 > fd0;
            boolean lb4 = false;
            fd1 = ld3 + fd0;
if(fo0 != null){
              fo0.m2(fd1, ld3, fd0, fd1, lb2, lb0, ab1, ab2);
}
            ab3 = ab4 && fb0;
            fb1 = lb4 && lb2;
}}
Thought.STACK_COUNTER++;
return ab2;
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
    double ld0 = 589.7071477597893;
    fb1 = ld0 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 0.8968347968732147;
    fb0 = ad1 < ad2;
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = ld1 - ad1;
        boolean lb2 = true;
        lb2 = ad2 > ad3;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fb1 = !lb2;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
        Thought lo3 = Thought35.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        Thought lo4 = Thought64.getInstance(fb0, fb1, lb2, fb0);
        if (fb1) {
}}
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
      fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    Output.points[3][7] -= ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought74.getInstance(ad1, ad2, ad3, ad4);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    boolean lb2 = true;
if(fo0 != null){
      ad3 = fo0.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
        Output.points[3][8] += fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought19.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Output.points[4][0] -= fd1;

Thought.STACK_COUNTER++;
return lb1;
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
    if (fb0) {
        boolean lb0 = true;
        boolean lb1 = true;
        lb1 = fb0 && fb1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
        lb0 = !lb1;
        fb0 = fb1 || lb0;
        ad3 = ad4 + fd0;
        Thought lo2 = Thought36.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb0);
}
        Thought lo3 = Thought12.getInstance();
        lb1 = ad4 < fd0;
        fd1 = ad1 - ad2;
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        ad2 = ad3 + ad4;
        Output.points[4][1] -= fd0;
        fb0 = fb1 || lb0;
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        for(int i0=0; i0<10; i0++){
}}
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
    ab2 = !ab3;
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Output.points[4][2] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought42.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
    double ld3 = 555.6947889199525;
    ld3 *= -1;
if(ao3 != null){
      ao3.m2(fd0, fd1, ld3, fd0, lb0, lb2, ab1, ab2);
}
    ab3 = !ab4;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = ld3 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, fb1, lb0, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ld3, fd0, fd1, ld3);
}
    Thought lo4 = Thought76.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0);

Thought.STACK_COUNTER++;
return lb0;
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
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        Output.points[4][3] += ad4;
if(ao3 != null){
          ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(ao4 != null){
          ab3 = ao4.m2();
}
        for(int i1=0; i1<10; i1++){
            ab4 = fb0 || fb1;
            ab1 = fd0 < fd1;
            ad1 *= -1;
if(fo0 != null){
              fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
            fd1 *= -1;
            Thought lo0 = Thought72.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}}
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    Thought lo2 = Thought41.getInstance();
    Output.points[4][4] -= fd1;
    Output.points[4][5] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought92.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);

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
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fd1 > fd0;
    lb2 = ab1 || ab2;
    ab3 = !ab4;
    Thought lo3 = Thought19.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought36.getInstance(ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
        fb1 = ad3 > ad4;
        fb0 = !fb1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        double ld1 = 213.25666375332074;
        ad3 = ad4 + fd0;
        double ld2 = 22.496902420085743;
        fd0 *= -1;
        fb0 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ld2 *= -1;
        fb1 = !fb0;
        fb1 = ad1 > ad2;
        boolean lb3 = false;
        lb3 = fb0 && fb1;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo0.m1();
}
        boolean lb4 = false;
        }
    for(int i1=0; i1<10; i1++){
        fb0 = ad2 < ad3;
        Output.points[4][6] -= ad4;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[4][7] -= ad1;
    ad2 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = !ab2;
    Output.points[4][8] -= ad3;
    ad4 *= -1;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    Thought lo0 = Thought49.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Output.points[5][0] += fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought46.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    Output.points[5][1] += fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld3 = 51.46011660279872;
    Thought lo4 = Thought8.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb0);
    fd1 = ld3 + fd0;
    lb2 = fd1 < ld3;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld3, fd0, fd1);
}
    ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
    ld3 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb2);
}
    double ld5 = 683.323388827232;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return ld3;
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[5][2] += fd1;
    double ld0 = 516.0909075895856;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought80.getInstance(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld0);
}
    lb1 = ad1 < ad2;
    boolean lb4 = false;
    Thought lo5 = Thought56.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, fb0, fb1);
}
if(ao1 != null){
      ao1.m2();
}
    lb1 = lb3 || lb4;
    ld0 *= -1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;
    fd1 = ld0 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, lb1, lb3, lb4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    double ld0 = 536.9050161113353;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought25.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ab1 && ab2;
    ab3 = ld0 < fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 513.9679379540588;
    ab2 = ld0 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought25.getInstance();
if(ao3 != null){
      ao3.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
    fb0 = ld0 > ad1;
    Output.points[5][3] -= ad2;
        fb1 = !ab1;
        ad3 = ad4 - fd0;
    ab2 = fd1 > ld0;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought66.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo3 = Thought70.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb4, fb0, fb1);
}
    fd1 *= -1;
    lb1 = lb4 && fb0;
    fd0 = fd1 - fd0;
    boolean lb5 = false;

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
            ab3 = fd0 > fd1;
    Thought lo0 = Thought49.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought37.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    double ld2 = 762.7148359839148;
    lb0 = !fb0;
    ad2 *= -1;
    fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;
    ld2 = ad1 + ad2;

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
    ad2 *= -1;
        ad3 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    double ld1 = 684.7937942158846;
    double ld2 = 205.02595197641975;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld1, ld2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld2, ad1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fd1 = ld1 + ld2;
    fb1 = ad1 > ad2;
    boolean lb3 = false;
if(fo0 != null){
      lb0 = fo0.m2(lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
    boolean lb5 = false;
    boolean lb6 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought86.getInstance();
    double ld1 = 974.0875854885581;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought18.getInstance(ao3, ao4, fo0, fo1);
    boolean lb3 = true;
    fd1 = ld1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb3, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
    fb0 = fb1 || lb3;
    fd0 = fd1 + ld1;
    Output.points[5][4] += fd0;
    fd1 = ld1 + fd0;
    boolean lb4 = true;
    Output.points[5][5] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld1);
}
if(ao2 != null){
      ao2.m1(lb4, fb0, fb1, lb3);
}
    lb4 = fd0 < fd1;
    Output.points[5][6] -= ld1;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fb0 = !fb1;
    fd1 *= -1;
    ld1 = fd0 + fd1;
    lb3 = lb4 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    Output.points[5][7] -= ad4;
    lb0 = !fb0;
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 > fd0;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(lb0, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
    double ld1 = 645.028392611112;
    if (fb0) {
        fb1 = ad2 < ad3;
        ad4 = fd0 - fd1;
        ld1 = ad1 - ad2;
        for(int i0=0; i0<10; i0++){
            Output.points[5][8] += ad3;
            }
        boolean lb2 = false;
        lb2 = lb0 && fb0;
if(ao4 != null){
          ad4 = ao4.m3();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = fd1 < fd0;
    Thought lo0 = Thought75.getInstance(ao4, fo0, fo1, ao1);
    fd1 = fd0 - fd1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought36.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo2 = Thought33.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
        Output.points[6][0] -= fd0;
if(fo0 != null){
          fo0.m3(ab1, ab2, ab3, ab4);
}
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        double ld4 = 931.8240458875958;
if(fo1 != null){
          ab4 = fo1.m2();
}
        boolean lb5 = false;
        ab4 = !fb0;
        ld4 = fd0 + fd1;
if(ao1 != null){
          ld4 = ao1.m3(fd0, fd1, ld4, fd0, fb1, lb3, lb5, ab1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ab2 = fd1 > ld4;
        fd0 *= -1;
        }
    fb0 = !fb1;

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
    ab1 = !ab2;
    double ld0 = 253.89977086706605;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought1.getInstance(ad4, fd0, fd1, ld0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought55.getInstance(ab4, fb0, fb1, ab1);
        }
    ab2 = ab3 && ab4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd1 = ao1.m3(ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
        boolean lb3 = false;
    ld0 = ad1 - ad2;
    boolean lb4 = true;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought80.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld1 = 210.69985862457702;
    fd0 = fd1 + ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought17.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fd1 = ld1 - fd0;
    fd1 *= -1;
    ld1 = fd0 - fd1;
    Thought lo4 = Thought45.getInstance();
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, fd0, fb0, fb1, lb3, fb0);
}
    double ld5 = 212.39920009776213;
    fd0 = fd1 + ld1;
        fb1 = ld5 < fd0;

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
    fb0 = fd1 > fd0;
    Output.points[6][1] -= fd1;
    boolean lb0 = false;
    Thought lo1 = Thought15.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Output.points[6][2] += fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb0 = false;
    Thought lo1 = Thought87.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
