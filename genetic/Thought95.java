package genetic;
import java.util.ArrayList;
class Thought95 extends Thought{
private static ArrayList<Thought95> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 917.0368076063498;
private double fd1 = 785.4827903667821;
private Thought fo0 = null;
private Thought fo1 = null;
Thought95 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought95 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought95 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought95 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought95 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought95 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought95 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought95 instance = new Thought95 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought4.getInstance(fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m2();
}
    fb1 = !lb1;

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
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fd0 *= -1;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought15.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    Thought lo3 = Thought42.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought78.getInstance(lb2, ab1, ab2, ab3);
    fd1 = fd0 - fd1;
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;

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
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought24.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
    double ld1 = 857.0753871939074;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
        fb1 = ad4 > fd0;
        fb0 = fd1 < ld1;
        Output.points[7][3] -= ad1;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo2 = Thought68.getInstance(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        for(int i1=0; i1<10; i1++){
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    Output.points[7][4] += ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    lb0 = lb1 && ab1;
    ad3 = ad4 + fd0;

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
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    fd0 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    if (fb1) {
        fd1 *= -1;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
            fd0 *= -1;
            fd1 = fd0 - fd1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, fb0, fb1);
}
            lb0 = !lb1;
            fd0 *= -1;
            fb0 = fb1 && lb0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    fb1 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[7][5] += ad3;
    ad4 = fd0 - fd1;
if(ao1 != null){
      ao1.m1();
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    ad3 *= -1;
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought70.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
    if (fb1) {
        boolean lb2 = true;
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
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    if (lb0) {
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        Output.points[7][6] -= fd1;
        Output.points[7][7] -= fd0;
        double ld1 = 860.4115656896671;
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
    boolean lb0 = true;
    ab1 = ad2 < ad3;
    ad4 *= -1;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought39.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    fd1 = ad1 - ad2;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
    boolean lb2 = false;
    ab4 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb2, ab1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 958.2264328821117;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[7][8] -= fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    fd1 *= -1;
    boolean lb3 = false;
    double ld4 = 747.7188463050057;
    ld0 = ld4 + fd0;
    Thought lo5 = Thought59.getInstance();
    lb1 = lb2 || lb3;
    Output.points[8][0] += fd1;
    Thought lo6 = Thought78.getInstance(ld0, ld4, fd0, fd1, fb0, fb1, lb1, lb2);
    lb3 = !fb0;
    boolean lb7 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb8 = false;
    lb8 = fb0 && fb1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    double ld0 = 672.972176686129;
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = !ab1;
    ab2 = !ab3;
    boolean lb1 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought13.getInstance();
    Thought lo1 = Thought99.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[8][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    Output.points[8][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought28.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    ad3 = ad4 + fd0;
    fb1 = fd1 > ad1;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    double ld1 = 736.912418825757;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][3] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m1(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 141.06827371631758;
    ld1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    fd1 = ad1 - ad2;
    fb1 = lb0 && fb0;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Output.points[8][4] -= ad4;
    Output.points[8][5] += fd0;
    fb1 = !lb0;
    fd1 *= -1;
    double ld1 = 430.3161821344889;
    fb0 = ld1 > ad1;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
    Thought lo2 = Thought67.getInstance(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;

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
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
              ao4 = fo0.m4();
}
    Thought lo1 = Thought28.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought84.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    Output.points[8][6] += ad4;
    ab4 = fd0 > fd1;
    fb0 = ad1 < ad2;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fb1 = !ab1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3();
}
    if (fb1) {
        boolean lb0 = true;
        lb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
        fb0 = fd0 < fd1;
        Thought lo1 = Thought25.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
        boolean lb2 = true;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        lb2 = fd0 < fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb2, fb0);
}
        fb1 = !lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
        boolean lb3 = false;
        lb2 = lb3 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        fb1 = lb0 || lb2;
        boolean lb4 = false;
        fd0 *= -1;
        double ld5 = 611.7052532484946;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0);
}
        lb4 = fb0 || fb1;
        fd1 *= -1;
        ld5 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb2, lb3, lb4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld6 = 522.1723563214206;
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
    Output.points[8][7] -= fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Output.points[8][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought59.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    double ld2 = 716.9199901208145;
    Output.points[0][0] += fd0;
    Thought lo3 = Thought20.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld0 = 734.3045894385892;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = ad2 < ad3;
    Thought lo2 = Thought42.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
    boolean lb3 = false;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      lb1 = fo1.m2(lb3, fb0, fb1, lb1);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
    Thought lo0 = Thought56.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        Output.points[0][1] -= fd0;
        fb1 = fd1 > ad1;
        if (ab1) {
            Thought lo1 = Thought61.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
            fd1 = ad1 + ad2;
            fb1 = ab1 || ab2;
            ad3 = ad4 - fd0;
if(fo0 != null){
              ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
            boolean lb2 = true;
            fd1 = ad1 + ad2;
}}
Thought.STACK_COUNTER++;
return ad3;
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought27.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[0][2] += fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    fb0 = !fb1;
    double ld2 = 726.9479000173982;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
    boolean lb3 = true;
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || lb1;
    lb3 = fd0 > fd1;
    Thought lo4 = Thought32.getInstance(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
    fb0 = fd0 < fd1;
    Output.points[0][3] += ld2;
    boolean lb5 = true;
    Thought lo6 = Thought65.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);

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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ad1;
    Thought lo0 = Thought20.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
if(ao4 != null){
      ao4.m1();
}
    double ld1 = 931.7035062963089;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    Output.points[0][4] += ad4;
    Output.points[0][5] += fd0;
    fd1 = ld1 - ad1;
    Output.points[0][6] += ad2;
        ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    Output.points[0][7] += ad3;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return ad4;
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
    Output.points[0][8] += fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought57.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    Output.points[1][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    double ld1 = 668.7826711951207;
    ab3 = ab4 && fb0;
        ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld1, ad1, ad2, fb1, lb0, ab1, ab2);
}
    Output.points[1][1] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ab3 = !ab4;
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
    double ld2 = 832.1319200200453;
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        lb0 = ab1 && ab2;
        ad2 = ad3 + ad4;
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld1, ld2, ad1);
}
        ad2 *= -1;
        ad3 = ad4 + fd0;
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought76.getInstance(fb1, fb0, fb1, fb0);
            double ld1 = 251.19799033198336;
    double ld2 = 127.1682201234399;
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo0.m2();
}
    fb1 = ld1 < ld2;
    Output.points[1][2] -= fd0;
    Thought lo3 = Thought12.getInstance(fd1, ld1, ld2, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ld1;
    fb1 = !fb0;
        ld2 *= -1;
    double ld4 = 332.380989098791;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[1][3] += ld4;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo1 = Thought88.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    fd0 *= -1;
    Output.points[1][4] += fd1;
    ab3 = !ab4;
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    Output.points[1][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb2, ab1, ab2);
}
    ab3 = !ab4;
    Output.points[1][6] += fd0;
    fb0 = fd1 > fd0;
    Output.points[1][7] += fd1;
    double ld3 = 203.6045103834028;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !lb0;
    boolean lb4 = true;
    ld3 = fd0 + fd1;
    ld3 = fd0 + fd1;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0, lb2, lb4, ab1, ab2);
}
    ab3 = fd1 > ld3;
    fd0 *= -1;
    Thought lo5 = Thought58.getInstance(fo1, fo0, fo1, fo0);
    ab4 = fd1 < ld3;

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
    ad2 = ad3 + ad4;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] -= ad3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    ad1 = ad2 + ad3;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    ad4 = fd0 - fd1;
    Output.points[2][0] -= ad1;
    Thought lo2 = Thought4.getInstance();
    fb1 = !lb0;
    boolean lb3 = false;
    boolean lb4 = false;
    lb1 = lb3 && lb4;
    ad2 *= -1;
    ad3 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb0, lb1, lb3, lb4);
}
    double ld5 = 614.3067164628912;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[2][1] += fd1;
    ad1 *= -1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ab4 = !fb0;
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
    fb0 = fb1 || lb0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2();
}
    double ld1 = 602.5908961879987;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
        fd1 = ld1 + ad1;
        double ld2 = 204.55897931760344;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 71.77558144803916;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    fb0 = !fb1;
    Output.points[2][2] += ld0;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    double ld1 = 742.9418537456415;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;

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
    ad1 = ad2 + ad3;
    Thought lo0 = Thought62.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
    Output.points[2][3] -= ad4;
    fd0 *= -1;
    fb0 = fb1 && lb1;
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    double ld2 = 38.163755379813345;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fb1, lb1, fb0, fb1);
}
    if (lb1) {
        fb0 = !fb1;
        lb1 = fd1 > ld2;
        fb0 = ad1 < ad2;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
    ab1 = fd1 > fd0;
    double ld0 = 878.7767740408648;
    ab2 = fd0 > fd1;
    Thought lo1 = Thought99.getInstance(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    ab4 = fb0 || fb1;
    ab1 = fd1 > ld0;
    Output.points[2][4] -= fd0;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0);
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = true;
    fd1 = ld0 - fd0;
    Output.points[2][5] -= fd1;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, lb4, lb5, ab1, ab2);
}
    double ld6 = 378.78146326154507;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ld6 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought50.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = ad1 - ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = false;
    Thought lo5 = Thought75.getInstance(lb1, lb2, lb3, lb4);
if(fo1 != null){
      ad3 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad2 *= -1;
    double ld6 = 782.352001638921;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
      ld6 = ao3.m3(ao4, fo0, fo1, ao1, lb3, lb4, ab1, ab2);
}
    boolean lb7 = false;

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought94.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = false;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    lb1 = lb2 || lb3;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 87.65265703744139;
        Thought lo1 = Thought87.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        boolean lb2 = false;
    double ld3 = 495.6289526370207;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, fd0, lb2, fb0, fb1, lb2);
}
    Thought lo4 = Thought90.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0, lb5, fb0, fb1, lb2);
}
    fd1 = ld0 + ld3;
    lb5 = fd0 < fd1;
    double ld6 = 722.2336077824302;
    ld0 = ld3 - ld6;
    fb0 = fb1 && lb2;
    lb5 = !fb0;
    fb1 = lb2 && lb5;

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
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    double ld0 = 584.6659758623501;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 112.55182757326011;
        fb0 = fb1 || fb0;
    ld0 = ld1 + fd0;
    fd1 *= -1;
    ld0 = ld1 + fd0;
    fb1 = fb0 || fb1;
    Thought lo2 = Thought54.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld0);
}
    double ld3 = 901.1668590198848;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1);
}
    fb1 = ld0 < ld1;
    boolean lb4 = true;
    Thought lo5 = Thought42.getInstance(lb4, fb0, fb1, lb4);
    boolean lb6 = true;

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
