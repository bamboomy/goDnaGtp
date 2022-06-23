package genetic;
import java.util.ArrayList;
class Thought47 extends Thought{
private static ArrayList<Thought47> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 639.7662840273391;
private double fd1 = 283.9558116264415;
private Thought fo0 = null;
private Thought fo1 = null;
Thought47 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought47 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought47 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb1 = !fb0;
        fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought57.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);

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
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought66.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    fd0 *= -1;
if(fo1 != null){
      ab1 = fo1.m2();
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
    fb1 = ad2 < ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
    double ld0 = 951.9546832023824;
    Output.points[0][1] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo2 = Thought75.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought13.getInstance(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    boolean lb4 = false;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, lb4);
}
    boolean lb5 = true;
    lb5 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb6 = false;
    Output.points[0][2] += ad3;
    lb1 = ad4 > fd0;
    lb4 = !lb5;

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
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    double ld2 = 84.85372789121193;
    Thought lo3 = Thought23.getInstance(ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fd0 = fd1 + ld2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[0][3] += fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought19.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought10.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo2 = Thought29.getInstance(fo0, fo1, ao1, ao2);

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
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
    fb0 = !fb1;
    if (fb0) {
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        fd0 = fd1 - ad1;
        ad2 *= -1;
        boolean lb0 = true;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
        double ld1 = 303.0792151637182;
        ad2 *= -1;
        lb0 = fb0 && fb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ld1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought7.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !ab1;
    Thought lo1 = Thought99.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
        Thought lo2 = Thought52.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        double ld3 = 296.6773934228747;
        ab1 = ld3 < fd0;
        fd1 = ld3 + fd0;
        boolean lb4 = true;
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
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    double ld1 = 906.0502839903642;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought41.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
    boolean lb3 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    ad1 = ad2 - ad3;
    ab2 = ab3 && ab4;
    boolean lb4 = true;
    ab4 = fb0 && fb1;
    lb0 = ad4 < fd0;
    lb3 = fd1 < ld1;
    lb4 = ad1 < ad2;
if(ao3 != null){
      ab1 = ao3.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ld1 = ad1 - ad2;
    fb1 = !lb0;
        ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, ab1, ab2);
}
    ab3 = fd1 > ld1;
    ab4 = ad1 < ad2;

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
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    Output.points[0][4] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    fd0 *= -1;
    ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = !fb0;
    double ld1 = 291.25460403145956;
    Thought lo2 = Thought13.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
    Output.points[0][5] -= ld1;
    fd0 *= -1;
    ab3 = fd1 > ld1;
    ab4 = fb0 && fb1;
    lb0 = !ab1;

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
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 > ad3;
        fb1 = ad4 < fd0;
        lb0 = fb0 || fb1;
        boolean lb1 = false;
        lb1 = !lb0;
        fd1 = ad1 + ad2;
        Output.points[0][6] += ad3;
        for(int i1=0; i1<10; i1++){
            boolean lb2 = true;
            lb0 = fb0 && fb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            ad4 *= -1;
            }
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, lb0, fb0, fb1);
}
        for(int i2=0; i2<10; i2++){
            lb1 = lb0 || fb0;
            ad3 = ad4 + fd0;
            fb1 = fd1 > ad1;
            ad2 = ad3 + ad4;
            lb1 = fd0 > fd1;
            ad1 = ad2 + ad3;
            ad4 *= -1;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo1 != null){
              fo1.m3(fd0, fd1, ad1, ad2);
}
            boolean lb3 = false;
            lb1 = lb0 && fb0;
            ad3 = ad4 - fd0;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad2 = fo0.m3(fb0, fb1, ab1, ab2);
}
    double ld0 = 460.83930728442084;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 156.77720966828915;
    double ld2 = 764.5807625077481;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, ld2, ad1, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        Thought lo3 = Thought35.getInstance();
        ad2 = ad3 + ad4;
        Output.points[0][7] -= fd0;
        Output.points[0][8] += fd1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Output.points[1][0] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought43.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 > fd0;
    Thought lo2 = Thought62.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    double ld3 = 332.3722894596923;
    boolean lb4 = false;
    Thought lo5 = Thought58.getInstance();
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld3, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, lb4, fb0, fb1);
}
    ld3 = fd0 + fd1;

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
    ad1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[1][1] += fd1;
    Thought lo0 = Thought29.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[1][2] -= fd0;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2();
}
    ad4 *= -1;
    Thought lo2 = Thought64.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }

return ab1;
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = ad1 < ad2;
    Thought lo1 = Thought11.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought16.getInstance(fo0, fo1, ao1, ao2);

Thought.STACK_COUNTER++;
return ab3;
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
    Output.points[1][3] += fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = fd0 > fd1;
        fb0 = fb1 && lb0;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
        double ld1 = 268.3884559072407;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][4] -= ad2;
    fb1 = !fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought2.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 622.9082464812915;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ld1 = fo0.m3(fb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb2 = ad1 > ad2;
    lb3 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    if (fb0) {
        fb1 = ad2 < ad3;
        lb2 = !lb3;
        fb0 = ad4 < fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought45.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    double ld1 = 877.396781168922;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = ld1 + ad1;
    ad2 = ad3 - ad4;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    Thought lo3 = Thought36.getInstance(fd0, fd1, ld1, ad1, lb2, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb2, ab1, ab2);
}
    ab3 = !ab4;
    boolean lb4 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo0 = Thought45.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = fd1 > fd0;
    fb1 = lb1 && fb0;
    Output.points[1][5] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      lb1 = ao2.m2(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    double ld2 = 29.751092248967993;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3();
}
    Output.points[1][6] -= fd0;
    Output.points[1][7] -= fd1;
    ad1 *= -1;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Output.points[1][8] += ad3;
if(ao4 != null){
      ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}

Thought.STACK_COUNTER++;
return ad2;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[2][0] -= fd1;
        boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    lb1 = fd1 > fd0;
    ab1 = ab2 && ab3;
    double ld2 = 355.74544307675103;
    ab4 = fb0 || fb1;
    lb0 = !lb1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
    double ld3 = 99.80752109603444;
    for(int i0=0; i0<10; i0++){
        }
if(ao2 != null){
      ab4 = ao2.m2();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld2, ld3, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, ld3, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ld2, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}

Thought.STACK_COUNTER++;
return ld2;
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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    double ld0 = 380.27423089028736;
    boolean lb1 = true;
    boolean lb2 = false;
    double ld3 = 357.6630531685719;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 || fb1;
    lb1 = ad2 > ad3;
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
    Output.points[2][1] += ld3;
if(ao2 != null){
      ab4 = ao2.m2();
}
    Thought lo4 = Thought14.getInstance(ad1, ad2, ad3, ad4);
    Thought lo5 = Thought58.getInstance(fb0, fb1, lb1, lb2);
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld3, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
        Thought lo6 = Thought62.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
        Thought lo7 = Thought18.getInstance(fo1, ao1, ao2, ao3);
        ab1 = ad1 < ad2;
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 749.9522109017254;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought38.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    double ld2 = 893.1813748533999;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > ld2;
    fb0 = fd0 < fd1;
    ld0 *= -1;
    ld2 = fd0 - fd1;
    double ld3 = 695.7954707861534;
    Thought lo4 = Thought99.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    ld0 *= -1;
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 || fb1;
    Thought lo5 = Thought57.getInstance(ld2, ld3, fd0, fd1);

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
    double ld0 = 359.915906111724;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought9.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ld0 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought52.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought14.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    if (fb1) {
        boolean lb4 = false;
        double ld5 = 59.12384979997911;
if(fo0 != null){
          lb4 = fo0.m2();
}
        Thought lo6 = Thought38.getInstance(ld5, ld0, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    double ld0 = 479.6153439340405;
    fb1 = !fb0;
    fb1 = ad1 > ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought50.getInstance(ad2, ad3, ad4, fd0);
    ab4 = !fb0;

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
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    Output.points[2][2] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    Output.points[2][3] -= fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb1 = false;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(lb1, fb0, fb1, lb0);
}
if(ao1 != null){
          lb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
        boolean lb2 = false;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][4] -= ad2;
    fb1 = fb0 || fb1;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[2][5] -= fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought11.getInstance();
if(ao2 != null){
      ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
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
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    fd0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    Thought lo1 = Thought73.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fd1 > fd0;
        fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    boolean lb4 = true;
if(ao3 != null){
      fd0 = ao3.m3(lb0, lb2, lb3, lb4);
}
    double ld5 = 826.6957545417041;
    Thought lo6 = Thought24.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld5, fd0);
    fd1 *= -1;

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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;
    ab2 = !ab3;
    boolean lb1 = true;
    fd0 *= -1;
    ab3 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought97.getInstance(ao1, ao2, ao3, ao4);

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
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought3.getInstance();
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 || fb0;
    fb1 = fd1 < fd0;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[2][6] -= fd0;

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
    double ld0 = 24.38418142399242;
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    fd0 *= -1;
    Output.points[2][7] -= fd1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought41.getInstance();
        Thought lo4 = Thought17.getInstance(fd0, fd1, ld0, fd0);
    fd1 = ld0 + fd0;
    fb0 = !fb1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    fd1 = ld0 + fd0;
    lb2 = fd1 < ld0;
    fd0 *= -1;
        boolean lb5 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb5, fb0, fb1, lb2);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb2);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb5, lb6, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
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
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[2][8] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    boolean lb0 = false;
    fd1 *= -1;
    Thought lo1 = Thought41.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
